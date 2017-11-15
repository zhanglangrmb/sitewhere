/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.outbound.spi.microservice;

import com.sitewhere.grpc.model.spi.client.IDeviceEventManagementApiChannel;
import com.sitewhere.grpc.model.spi.client.IDeviceManagementApiChannel;
import com.sitewhere.spi.microservice.multitenant.IMultitenantMicroservice;

/**
 * Microservice that provides outbound event processing functionality.
 * 
 * @author Derek
 */
public interface IOutboundProcessingMicroservice extends IMultitenantMicroservice<IOutboundProcessingTenantEngine> {

    /**
     * Get device management API channel.
     * 
     * @return
     */
    public IDeviceManagementApiChannel getDeviceManagementApiChannel();

    /**
     * Get event management API channel.
     * 
     * @return
     */
    public IDeviceEventManagementApiChannel getDeviceEventManagementApiChannel();
}