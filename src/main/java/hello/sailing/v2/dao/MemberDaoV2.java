package hello.sailing.v2.dao;

import hello.sailing.v2.vo.Cust_info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDaoV2 {
    List<Cust_info> doList();
    List<Cust_info> doSearch(String strStartDate, String strEndDate, String strName);
}
