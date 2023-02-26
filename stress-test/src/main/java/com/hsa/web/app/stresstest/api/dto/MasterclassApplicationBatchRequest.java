package com.hsa.web.app.stresstest.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class MasterclassApplicationBatchRequest {

  MasterclassApplicationDto masterclassApplicationDto;
  int operationsCount;

}
