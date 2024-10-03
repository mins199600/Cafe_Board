package hello.sailing.v2.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDaoV2 {

    List<Map<String, Object>> doList();

    int doInsert(String strCoffee, String strKind, String strPrice);

    int doDelete(String strNo);

    //one row 조회
    Map<String, Object> doListOne(String strNo);

    //업데이트
    int doUpdate(String strNo, String strCoffee, String strKind, String strPrice);
    List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind);

    //가격변경
    int doUpdatePrice(String strNo, String strPrice);
    //가격 변경 로그 입력
    int doInsertLog(String strNo, String strPrice);

    int doInsertLogOne(List<String> chkList, String strPrice);

    int doUpdatePriceOne(List<String> chkList, String strPrice);
}
