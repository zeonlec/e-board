package org.eboard.web.community.controller.api;

import org.eboard.web.community.dto.CommunityRequestDto;
import org.eboard.web.community.service.CommunityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("e-board/api/v1")
public class CommunityApiController {
	
	private final CommunityService communityService;
	
	@PostMapping("/community/posts")
	public Long register(@RequestBody CommunityRequestDto registerCommunity) {
		return communityService.register(registerCommunity);
	}
}
