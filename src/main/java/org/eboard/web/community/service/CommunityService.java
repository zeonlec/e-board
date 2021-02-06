package org.eboard.web.community.service;

import org.eboard.web.community.dto.CommunityRequestDto;
import org.eboard.web.community.mapper.CommunityMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional
public class CommunityService {
	
	private final CommunityMapper communityMapper;
	
	public Long register(CommunityRequestDto communityDto) {
		CommunityRequestDto registerDto = CommunityRequestDto.CreateCommunityBuilder()
										.title(communityDto.getTitle())
										.userId(communityDto.getUserId())
										.content(communityDto.getContent())
										.build();
		return communityMapper.insertCommunity(registerDto);
	}
	
}
