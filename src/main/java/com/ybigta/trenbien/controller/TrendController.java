package com.ybigta.trenbien.controller;

import com.ybigta.trenbien.domain.entity.Trend;
import com.ybigta.trenbien.domain.entity.dto.TrendDto;
import com.ybigta.trenbien.domain.entity.dto.TrendLongLatDto;
import com.ybigta.trenbien.domain.entity.dto.TrendRecommandScoreDto;
import com.ybigta.trenbien.request.GpsCoordinate;
import com.ybigta.trenbien.request.Tags;
import com.ybigta.trenbien.service.TrendService;
import com.ybigta.trenbien.util.Distance;
import com.ybigta.trenbien.valuemapping.NewTagReverseMap;
import com.ybigta.trenbien.valuemapping.TagMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@Controller
public class TrendController {
    @Autowired
    private TrendService trendService;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/Home/{num}")
    public List<TrendDto> get50Trend(@PathVariable Integer num){ //0전체 1 카페 2음식 3놀거리
        List<TrendDto> trendDtoList = new ArrayList<>();
        switch (num){
            case 0:
                trendDtoList = trendService.findNByOrderByScoreDescDto(PageRequest.of(0,50));
                break;
            case 1:
                trendDtoList = trendService.findNWhereCategoryByOrderByScoreDescDto(PageRequest.of(0,50), "카페");
                break;
            case 2:
                trendDtoList = trendService.findNWhereCategoryByOrderByScoreDescDto(PageRequest.of(0,50), "음식점");
                break;
            case 3:
                trendDtoList = trendService.findNWhereCategoryByOrderByScoreDescDto(PageRequest.of(0,50), "놀거리");
                break;
            default:
        }
        return trendDtoList;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PostMapping("/Near")
    public List<TrendLongLatDto> get20NearTrend(@RequestBody GpsCoordinate gpsCoordinate){
        long trendCount = trendService.getCount();
        List<TrendLongLatDto> trendLongLatDtoList = trendService.findNByOrderByScoreDescLongLatDto(PageRequest.of(0,(int) trendCount), gpsCoordinate.getDistrictNum());
        Float myLatitude = gpsCoordinate.getLatitude();
        Float myLongitude = gpsCoordinate.getLongitude();
        PriorityQueue<TrendLongLatDto> priorityQueue = new PriorityQueue<>();
        for (TrendLongLatDto trendLongLatDto : trendLongLatDtoList){
            Float trendLatitude = trendLongLatDto.getLatitude();
            Float trendLongitude = trendLongLatDto.getLongitude();
            Integer distance = Distance.getDistanceFromLatAndLong(myLatitude, myLongitude, trendLatitude, trendLongitude);
            if (distance != null){
                trendLongLatDto.setDistance(distance);
                priorityQueue.add(trendLongLatDto);
            }
        }
        List<TrendLongLatDto> resultTrendLongLatDtoList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            if (priorityQueue.isEmpty()){
                break;
            }
            resultTrendLongLatDtoList.add(priorityQueue.poll());
        }
        return resultTrendLongLatDtoList;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PostMapping("/Recommand")
    public List<TrendRecommandScoreDto> get20RecommandTrend(@RequestBody Tags tags){
        String tag1 = NewTagReverseMap.NewTagReverseHashMap.get(tags.getTag1());
        String tag2 = NewTagReverseMap.NewTagReverseHashMap.get(tags.getTag2());
        String tag3 = NewTagReverseMap.NewTagReverseHashMap.get(tags.getTag3());
        String category = tags.getCategory();
        Integer tag1Num = TagMap.TagHashMap.get(tag1);
        Integer tag2Num = TagMap.TagHashMap.get(tag2);
        Integer tag3Num = TagMap.TagHashMap.get(tag3);
        List<Integer> tagNumList = new ArrayList<>();
        tagNumList.add(tag1Num);
        tagNumList.add(tag2Num);
        tagNumList.add(tag3Num);
        List<Trend> trendList = trendService.findAllWhereCategory(category);
        PriorityQueue<TrendRecommandScoreDto> priorityQueue = new PriorityQueue<>();
        for (Trend trend : trendList){
            double recommendataionScore = 0;
            Float score = trend.getScore();
            Float kakaoScore = trend.getKakaoScore();
            Float grade = trend.getGrade();
            if (score == null || kakaoScore == null || grade == null){
                continue;
            }
            Float weight = 1f;
            for (Integer tagNum : tagNumList){
                switch (tagNum){
                    case 0:
                        recommendataionScore = recommendataionScore + trend.getPriceIsReasonable() * weight;
                        break;
                    case 1:
                        recommendataionScore = recommendataionScore + trend.getGoodValueForMoney() * weight;
                        break;
                    case 2:
                        recommendataionScore = recommendataionScore + trend.getGoodForGroupMeeting() * weight;
                        break;
                    case 3:
                        recommendataionScore = recommendataionScore + trend.getGoodForTalking() * weight;
                        break;
                    case 4:
                        recommendataionScore = recommendataionScore + trend.getDesertIsGood() * weight;
                        break;
                    case 5:
                        recommendataionScore = recommendataionScore + trend.getStoreIsSpacious() * weight;
                        break;
                    case 6:
                        recommendataionScore = recommendataionScore + trend.getStoreIsClean() * weight;
                        break;
                    case 7:
                        recommendataionScore = recommendataionScore + trend.getParentsLikeToRest() * weight;
                        break;
                    case 8:
                        recommendataionScore = recommendataionScore + trend.getViewIsGood() * weight;
                        break;
                    case 9:
                        recommendataionScore = recommendataionScore + trend.getWorthAsMuchAsExpensive() * weight;
                        break;
                    case 10:
                        recommendataionScore = recommendataionScore + trend.getBreadIsDelicious() * weight;
                        break;
                    case 11:
                        recommendataionScore = recommendataionScore + trend.getGoodForPicture() * weight;
                        break;
                    case 12:
                        recommendataionScore = recommendataionScore + trend.getExplanationIsDetailed() * weight;
                        break;
                    case 13:
                        recommendataionScore = recommendataionScore + trend.getQuantityIsGood() * weight;
                        break;
                    case 14:
                        recommendataionScore = recommendataionScore + trend.getOneDayClassIsGood() * weight;
                        break;
                    case 15:
                        recommendataionScore = recommendataionScore + trend.getDrinkIsGood() * weight;
                        break;
                    case 16:
                        recommendataionScore = recommendataionScore + trend.getFoodIsGood() * weight;
                        break;
                    case 17:
                        recommendataionScore = recommendataionScore + trend.getInteriorIsGood() * weight;
                        break;
                    case 18:
                        recommendataionScore = recommendataionScore + trend.getIngredientIsFresh() * weight;
                        break;
                    case 19:
                        recommendataionScore = recommendataionScore + trend.getGoodForParking() * weight;
                        break;
                    case 20:
                        recommendataionScore = recommendataionScore + trend.getGoodForKindness() * weight;
                        break;
                    case 21:
                        recommendataionScore = recommendataionScore + trend.getCoffeeIsDelicious() * weight;
                        break;
                    case 22:
                        recommendataionScore = recommendataionScore + trend.getGoodForSpecialDay() * weight;
                        break;
                    case 23:
                        recommendataionScore = recommendataionScore + trend.getSpecialMenuExists() * weight;
                        break;
                    case 24:
                        recommendataionScore = recommendataionScore + trend.getGoodForEatingAlone() * weight;
                        break;
                    case 25:
                        recommendataionScore = recommendataionScore + trend.getToiletIsClean() * weight;
                        break;
                    case 26:
                        recommendataionScore = recommendataionScore + trend.getGoodForBarbecue() * weight;
                        break;
                    case 27:
                        recommendataionScore = recommendataionScore + trend.getGoodForGift() * weight;
                        break;
                    case 28:
                        recommendataionScore = recommendataionScore + trend.getManageSafely() * weight;
                        break;
                    case 29:
                        recommendataionScore = recommendataionScore + trend.getRestAreaIsWellEquipped() * weight;
                        break;
                    case 30:
                        recommendataionScore = recommendataionScore + trend.getSuitableForBeginners() * weight;
                        break;
                    case 31:
                        recommendataionScore = recommendataionScore + trend.getEnoughClassTime() * weight;
                        break;
                    case 32:
                        recommendataionScore = recommendataionScore + trend.getPleasantForReading() * weight;
                        break;
                    case 33:
                        recommendataionScore = recommendataionScore + trend.getMenuStructureIsClear() * weight;
                        break;
                    case 34:
                        recommendataionScore = recommendataionScore + trend.getMeatQualityIsGood() * weight;
                        break;
                    case 35:
                        recommendataionScore = recommendataionScore + trend.getBakeWell() * weight;
                        break;
                    case 36:
                        recommendataionScore = recommendataionScore + trend.getThemeIsInteresting() * weight;
                        break;
                    case 37:
                        recommendataionScore = recommendataionScore + trend.getCozy() * weight;
                        break;
                    case 38:
                        recommendataionScore = recommendataionScore + trend.getHealthyTastes() * weight;
                        break;
                    case 39:
                        recommendataionScore = recommendataionScore + trend.getGoodForFocus() * weight;
                        break;
                    case 40:
                        recommendataionScore = recommendataionScore + trend.getRoomIsGood() * weight;
                        break;
                    case 41:
                        recommendataionScore = recommendataionScore + trend.getConceptIsUnique() * weight;
                        break;
                    case 42:
                        recommendataionScore = recommendataionScore + trend.getCustomClassIsGood() * weight;
                        break;
                    case 43:
                        recommendataionScore = recommendataionScore + trend.getPackagingIsClean() * weight;
                        break;
                    case 44:
                        recommendataionScore = recommendataionScore + trend.getCloseToLocalTaste() * weight;
                        break;
                    case 45:
                        recommendataionScore = recommendataionScore + trend.getFoodComesFast() * weight;
                        break;
                    case 46:
                        recommendataionScore = recommendataionScore + trend.getSeatIsComfortable() * weight;
                        break;
                    case 47:
                        recommendataionScore = recommendataionScore + trend.getExperienceProgramsAreVarious() * weight;
                        break;
                    case 48:
                        recommendataionScore = recommendataionScore + trend.getSideDishesAreGood() * weight;
                        break;
                    case 49:
                        recommendataionScore = recommendataionScore + trend.getManyPrettyItems() * weight;
                        break;
                    case 50:
                        recommendataionScore = recommendataionScore + trend.getOutdoorSpaceIsNice() * weight;
                        break;
                    case 51:
                        recommendataionScore = recommendataionScore + trend.getProductsAreDiverse() * weight;
                        break;
                    case 52:
                        recommendataionScore = recommendataionScore + trend.getBreakfastIsDelicious() * weight;
                        break;
                    case 53:
                        recommendataionScore = recommendataionScore + trend.getGoodForStayingLong() * weight;
                        break;
                    case 54:
                        recommendataionScore = recommendataionScore + trend.getFacilitiesAreClean() * weight;
                        break;
                    case 55:
                        recommendataionScore = recommendataionScore + trend.getSpaceIsLarge() * weight;
                        break;
                    case 56:
                        recommendataionScore = recommendataionScore + trend.getManyExperiencePrograms() * weight;
                        break;
                    case 57:
                        recommendataionScore = recommendataionScore + trend.getVentilationIsGood() * weight;
                        break;
                    case 58:
                        recommendataionScore = recommendataionScore + trend.getQualityIsGood() * weight;
                        break;
                    case 59:
                        recommendataionScore = recommendataionScore + trend.getCalmMood() * weight;
                        break;
                    case 60:
                        recommendataionScore = recommendataionScore + trend.getGoodForResting() * weight;
                        break;
                    case 61:
                        recommendataionScore = recommendataionScore + trend.getBig() * weight;
                        break;
                    case 62:
                        recommendataionScore = recommendataionScore + trend.getWellManaged() * weight;
                        break;
                    case 63:
                        recommendataionScore = recommendataionScore + trend.getManySpecialProducts() * weight;
                        break;
                    case 64:
                        recommendataionScore = recommendataionScore + trend.getIsPrivate() * weight;
                        break;
                }
                weight = weight * 0.5f;
            }
            recommendataionScore = recommendataionScore + score / 200 + (kakaoScore * 0.5 + grade * 0.5) / 400;
            TrendRecommandScoreDto trendRecommandScoreDto = TrendRecommandScoreDto.builder()
                    .name(trend.getName())
                    .category(trend.getCategory())
                    .detailedAddress(trend.getDetailedAddress())
                    .placeUrl(trend.getPlaceUrl())
                    .imageUrl(trend.getImageUrl())
                    .tag1(trend.getTag1())
                    .tag2(trend.getTag2())
                    .build();
            trendRecommandScoreDto.setRecommandScore((float)recommendataionScore);
            priorityQueue.add(trendRecommandScoreDto);
        }
        List<TrendRecommandScoreDto> resultTrendRecommandScoreDtoList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            if (priorityQueue.isEmpty()){
                break;
            }
            resultTrendRecommandScoreDtoList.add(priorityQueue.poll());
        }
        return resultTrendRecommandScoreDtoList;
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/District/{districtNum}")
    public List<TrendDto> get20DistrictTrend(@PathVariable Integer districtNum){
        List<TrendDto> trendDtoList = trendService.findNWhereDistrictByOrderByScoreDescDto(PageRequest.of(0,20), districtNum);
        return trendDtoList;
    }
}

