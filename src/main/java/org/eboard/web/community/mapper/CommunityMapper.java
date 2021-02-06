package org.eboard.web.community.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.eboard.web.community.dto.CommunityRequestDto;

@Mapper
public interface CommunityMapper {
	
	public Long insertCommunity(CommunityRequestDto communityDto);
}
