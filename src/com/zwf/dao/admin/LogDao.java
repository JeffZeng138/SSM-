package com.zwf.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zwf.entity.admin.Authority;
import com.zwf.entity.admin.Log;

/**
 * 系统日志类dao
 * @author llq
 *
 */
@Repository
public interface LogDao {
	public int add(Log log);
	public List<Log> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
	public int delete(String ids);
}
