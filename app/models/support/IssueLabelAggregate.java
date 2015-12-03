/**
 * Yobi, Project Hosting SW
 * <p>
 * Copyright 2015 NAVER Corp.
 * http://yobi.io
 *
 * @author Suwon Chae
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models.support;

import com.avaje.ebean.annotation.Sql;
import play.db.ebean.Model;

import javax.persistence.Entity;

@Entity
@Sql
public class IssueLabelAggregate extends Model {
    private static final long serialVersionUID = -8843323869004757091L;
    public Long issueId;
    public Long issueLabelId;
}