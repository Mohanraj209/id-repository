package io.mosip.idrepository.core.dto;

import java.time.LocalDateTime;

import io.mosip.idrepository.core.constant.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Manoj SP
 *
 */    
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VidInfoDTO {

	private String vid;
	private LocalDateTime expiryTimestamp;
	private Integer transactionLimit;
}
