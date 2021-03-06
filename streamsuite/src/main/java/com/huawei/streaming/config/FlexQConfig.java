/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.config;

/**
 *
 * <METAQ连接配置信息>
 * <METAQ连接配置信息>
 */
public class FlexQConfig
{
    /**
     * METAQ的生产者zookeeper连接的配置参数
     */
    public static final String METAQ_PRO_ZK_CONNECT = "zk.connect";

    /**
     * METAQ的消费者zookeeper连接的配置参数
     */
    public static final String METAQ_CON_ZK_CONNECT = "zookeeper.connect";

    /**
     * broker list
     */
    public static final String METAQ_BROKER_LIST = "metadata.broker.list";

    /**
     * METAQ客户端的id配置参数
     */
    public static final String METAQ_GROUP_ID = "group.id";

    /**
     * 序列化类配置参数
     */
    public static final String METAQ_SERIAL_CLASS = "serializer.class";

    /**
     * zookeeper的session有效时间
     */
    public static final String METAQ_SESSION_TIME = "zk.sessiontimeout.ms";

    /**
     * METAQ的zk.synctime.ms参数
     */
    public static final String METAQ_SYNC_TIME = "zk.synctime.ms";

    /**
     * METAQ的topic参数
     */
    public static final String METAQ_TOPIC = "metaq_topic";

    /**
     * 分隔符
     */
    public static final String METAQ_SEPARATOR = "metaq_separator";

    /**
     * 格式化类型，TXT、CSV等
     */
    public static final String METAQ_FORMAT_TYPE = "metaq_format_type";

    /**
     * metaQ offset配置
     */
    public static final String METAQ_OFFSET_RESET = "auto.offset.reset";
}
