package hello.sailing.v2.service;
import hello.sailing.v2.dao.MenuDaoV2;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class MenuSvcV2 {

    @Autowired
    MenuDaoV2 menuDaoV2;

    public MenuSvcV2() {
        log.info("===== MenuSvc , 생성자 =====");
    }

    public List<Map<String, Object>> doList() {
        List<Map<String, Object>> list = menuDaoV2.doList();
        log.info(list);
        return list;
    }

    public int doInsert(String strCoffee, String strKind, String strPrice) {
        int i = menuDaoV2.doInsert(strCoffee,strKind,strPrice);
        return i;
    }

    public int doDelete(String strNo) {
        int i = menuDaoV2.doDelete(strNo);
        return i;
    }
    //one row 조회
    public Map<String, Object> doListOne(String strNo) {

        Map<String, Object> map = menuDaoV2.doListOne(strNo);

        return map;
    }

    //수정
    public int doUpdate(String strNo,String strCoffee, String strKind, String strPrice) {
        int i = menuDaoV2.doUpdate(strNo, strCoffee, strKind, strPrice);
        return i;
    }


    public List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) {

        List<Map<String, Object>> list = menuDaoV2.doSearch(strStartDate, strEndDate, strCoffee, strKind);
        return list;
    }

    public int doUpdatePrice(String strNo, String strPrice) {
        int int2 = menuDaoV2.doUpdatePrice(strNo, strPrice);
        return int2;
    }
    //가격변경 로그
    public int doInsertLog(String strNo, String strPrice) {
        int int1 = menuDaoV2.doInsertLog(strNo, strPrice);
        return int1;
    }

    public int doInsertLogOne(List<String> chkList, String strPrice) {
        int int1 = menuDaoV2.doInsertLogOne(chkList, strPrice);
        return int1;
    }

    public int doUpdatePriceOne(List<String> chkList, String strPrice) {
        int int2 = menuDaoV2.doUpdatePriceOne(chkList, strPrice);
        return int2;
    }
}

