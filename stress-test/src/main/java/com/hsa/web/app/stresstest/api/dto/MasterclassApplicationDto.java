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
public class MasterclassApplicationDto {

  private String firstName;
  private String lastName;
  private int age;
  private String currentCompany;
  private int yearsOfExperience;

}
