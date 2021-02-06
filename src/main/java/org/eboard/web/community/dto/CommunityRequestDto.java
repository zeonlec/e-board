package org.eboard.web.community.dto;

import java.time.LocalDateTime;

import org.springframework.util.Assert;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author parksoobin
 * CRUD 중 Create, Update 처리시 해당 필드 값들을 담아 Service Layer와  Repository Layer에 전달할 때 사용되는 전송 객체
 */
@ToString
@Getter
@NoArgsConstructor
public class CommunityRequestDto {
	
	private Long idx;
	private String title;
	private String content;
	private String userId;
	private Long hitCnt;
	private LocalDateTime createdDatetime;
	private LocalDateTime modifiedDatetime;
	
	@Builder(builderClassName = "CreateCommunityBuilder", builderMethodName = "CreateCommunityBuilder")
	public CommunityRequestDto(String title, String userId, String content) {
		Assert.hasText(title, "title is not be empty");
		Assert.hasText(userId, "userId is not be empty");
		Assert.hasText(content, "content is not be empty");
		this.title = title;
		this.userId = userId;
		this.content = content;
	}
	
	@Builder(builderClassName = "ModifyCommunityBuilder", builderMethodName = "ModifyCommunityBuilder")
	public CommunityRequestDto (Long idx, String title, String content) {
		Assert.hasText(title, "title is not be empty");
		Assert.hasText(content, "content is not be empty");
		this.idx = idx;
		this.title = title;
		this.content = content;
	}
	
	
}
