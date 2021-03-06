/*
 * Seldon -- open source prediction engine
 * =======================================
 *
 * Copyright 2011-2015 Seldon Technologies Ltd and Rummble Ltd (http://www.seldon.io/)
 *
 * ********************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ********************************************************************************************
 */

/*
 * Created on 10-May-2006
 *
 */
package io.seldon.db.jdo;

public class DatabaseException extends Exception {
    
    int playtxtErrNum;
    
    public DatabaseException(final int errNum)
    {
        this.playtxtErrNum = errNum;
    }
    
    public DatabaseException(final int errNum,Exception ex)
    {
        super(ex);
        this.playtxtErrNum = errNum;
    }
    
    public int getPlaytxtErrNum()
    {
        return this.playtxtErrNum;
    }
}
