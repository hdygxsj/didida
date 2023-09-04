/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hdygxsj.dida.api.domain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hdygxsj.dida.api.domain.entity.GroupDO;
import com.hdygxsj.dida.api.domain.entity.UserDO;
import com.hdygxsj.dida.api.domain.entity.UserGroupRelDO;

import java.util.List;

public interface GroupDomainService {
    void add(GroupDO groupDO);

    GroupDO get(String code);

    void addUser(String groupCode, String username);

    Page<GroupDO> page(int pageNum, int pageSize,String name,String code);

    List<GroupDO> listByUser(UserDO userDO);

    boolean hasGroup(UserDO userDO, String groupCode);

    void deleteByCode(String code);

    Page<UserGroupRelDO> pageGroupMember(String code,String username, int pageNum, int pageSize);

    void deleteMember(String code,String username);
}
