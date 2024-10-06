package hello.sailing.v2.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuSvcV2Test {

    @Autowired
    MenuSvcV2 menuSvcV2;

    @Test
    void doUpdateInsert() {
        List<String> chkList = new ArrayList<>();
        chkList.add("19");
        chkList.add("20");

        String strPrice = "43838384";
        try {
            menuSvcV2.doUpdateInsert(chkList, strPrice);
        }catch (Exception e) {
            System.out.println("===========Test===========" + e.getMessage());
        }
    }
}