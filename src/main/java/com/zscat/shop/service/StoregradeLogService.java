package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StoregradeLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StoregradeLogService {
	
	StoregradeLogDO get(Long id);
	
	List<StoregradeLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoregradeLogDO storegradeLog);
	
	int update(StoregradeLogDO storegradeLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StoregradeLogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
