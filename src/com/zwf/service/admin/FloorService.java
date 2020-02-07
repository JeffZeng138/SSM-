package com.zwf.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.zwf.entity.admin.Floor;

/**
 * ¥��service
 * @author Administrator
 *
 */
@Service
public interface FloorService {
	public int add(Floor floor);
	public int edit(Floor floor);
	public int delete(Long id);
	public List<Floor> findList(Map<String, Object> queryMap);
	public List<Floor> findAll();
	public Integer getTotal(Map<String, Object> queryMap);
}
