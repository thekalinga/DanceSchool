package com.elipcero.classroomschool.services;

import com.elipcero.classroomschool.domains.ClassCustomerDayTotal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "classcustomerview-school")
public interface ClassCustomerTotalViewResource {

    @GetMapping(value = "classCustomerDayTotals/{id}")
    Resource<ClassCustomerDayTotal> getCalendarSummaryByClassId(@PathVariable("id") int id);
}