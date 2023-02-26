package com.hsa.web.app.stresstest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class MasterclassApplication {

  private String id;
  private String firstName;
  private String lastName;
  private int age;
  private String currentCompany;
  private int yearsOfExperience;

}
