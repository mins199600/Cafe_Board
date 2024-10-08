package hello.sailing.v2.comm;

import hello.sailing.v2.dao.MenuDaoV2;
import hello.sailing.v2.service.MenuSvcV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class Bootlog {

    @Autowired
    MenuDaoV2 menuDaoV2;


    public int doBootLog(String strClass) {
        int int1 = menuDaoV2.doBootLog(strClass);
        return int1;
    }
}
