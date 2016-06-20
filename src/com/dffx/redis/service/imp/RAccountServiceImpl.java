package com.dffx.redis.service.imp;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dffx.redis.dao.BaseDao;
import com.dffx.redis.service.RAccountService;

/**  
 *
 * @author tongyicheng
 * @date 2015-06-25
 */
@Service
public class RAccountServiceImpl implements RAccountService{
    
    @Autowired
    protected BaseDao baseDao;

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
		baseDao.delete(key);
	}

	@Override
	public void delete(String key, Object arg) {
		// TODO Auto-generated method stub
		
		baseDao.delete(key, arg);
	}

	@Override
	public void deleteList(Collection<String> keys) {
		// TODO Auto-generated method stub
		
		baseDao.deleteList(keys);
	}

	@Override
	public Object get(String key, Object arg) {
		// TODO Auto-generated method stub
		
		return baseDao.get(key, arg);
	}

	@Override
	public boolean hasKey(String key, Object arg) {
		// TODO Auto-generated method stub
		
		return baseDao.hasKey(key, arg);
	}

	@Override
	public Set<Object> keys(String key) {
		// TODO Auto-generated method stub
		
		return baseDao.keys(key);
	}

	@Override
	public Long lengthObj(String key) {
		// TODO Auto-generated method stub
		
		return baseDao.lengthObj(key);
	}

	@Override
	public List<Object> multiGet(String key, Collection<Object> col) {
		// TODO Auto-generated method stub
		
		return baseDao.multiGet(key, col);
	}

	@Override
	public void put(String key, Object arg, Object value) {
		// TODO Auto-generated method stub
		
		baseDao.put(key, arg, value);
	}

	@Override
	public void putAll(String key, Map<Object, Object> map) {
		// TODO Auto-generated method stub
		
		baseDao.putAll(key, map);
	}

	@Override
	public void putIfAbsent(String key, Object arg, Object value) {
		// TODO Auto-generated method stub
		
		baseDao.putIfAbsent(key, arg, value);
	}

	@Override
	public Map<Object, Object> readAll(String key) {
		// TODO Auto-generated method stub
		
		return baseDao.readAll(key);
	}

	@Override
	public List<Object> readList(String key) {
		// TODO Auto-generated method stub
		
		return baseDao.readList(key);
	}

	@Override
	public void put(String key, Object arg, Object value, long time) {
		// TODO Auto-generated method stub
		
		baseDao.put(key, arg, value, time);
	}

	public void putClearTime(String key,Object arg,Object value,Date time){
		baseDao.putClearTime(key, arg, value, time);
	}

}
