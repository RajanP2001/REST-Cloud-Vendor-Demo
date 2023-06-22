package com.cloudvendor.restcloudvendordemo.controller;

import com.cloudvendor.restcloudvendordemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor successfully created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor successfully updated";
    }

    @DeleteMapping("/{vendorId}")
    public String updateCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor successfully deleted";
    }


}
