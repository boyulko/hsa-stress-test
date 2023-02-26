package com.hsa.web.app.stresstest.service;

import com.hsa.web.app.stresstest.api.dto.MasterclassApplicationDto;
import com.hsa.web.app.stresstest.entity.MasterclassApplication;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MasterclassApplicationService {

  private final MongoTemplate mongoTemplate;

  public void saveMasterclassApplication(MasterclassApplicationDto dto) {
    var id = UUID.randomUUID().toString();
    var masterclassApplication = new MasterclassApplication(id,
        dto.getFirstName(),
        dto.getLastName(),
        dto.getAge(),
        dto.getCurrentCompany(),
        dto.getYearsOfExperience());

    mongoTemplate.save(masterclassApplication);
  }

}
