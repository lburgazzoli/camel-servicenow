/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.lburgazzoli.camel;

import com.github.lburgazzoli.camel.salesforce.model.CaseComment;
import com.github.lburgazzoli.camel.servicenow.model.ServiceNowIncidentImportRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CaseCommentToIncidentProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {;
        ServiceNowIncidentImportRequest request = new ServiceNowIncidentImportRequest();
        request.setComment(exchange.getIn().getBody(CaseComment.class).getCommentBody());
        request.setExternalId(exchange.getIn().getHeader("ServiceNowExternalId", String.class));

        exchange.getIn().setBody(request);
    }
}
