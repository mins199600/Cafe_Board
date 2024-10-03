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


    public List<Map<String, Object>> dolistOld() {

        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("No","1");
        map.put("name","아이스아메리카노");
        map.put("kind","커피");
        map.put("price","2,000");
        map.put("reg_day","2020.10.29");
        map.put("mod_day","2021.10.29");
        list.add(map);

        Map<String, Object> map2 = new HashMap<>();

        map2.put("No","2");
        map2.put("name","아이스초코");
        map2.put("kind","음료");
        map2.put("price","4,000");
        map2.put("reg_day","2020.10.29");
        map2.put("mod_day","2021.10.29");
        list.add(map2);

        Map<String, Object> map3 = new HashMap<>();

        map3.put("No","3");
        map3.put("name","아이스불샷");
        map3.put("kind","음료");
        map3.put("price","4,500");
        map3.put("reg_day","2020.10.29");
        map3.put("mod_day","2021.10.29");
        list.add(map3);

        log.info(list);

        return list;
    }

    public int doInsert(String strCoffee, String strkind, String strPrice) {
        int i = menuDaoV2.doInsert(strCoffee,strkind,strPrice);
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

