/**********************************************************************
Copyright (c) 2006 Erik Bengtson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 

Contributors:
    ...
**********************************************************************/

package org.datanucleus.store.rdbms.mapping.datastore;

import java.io.IOException;
import java.sql.SQLException;

import org.datanucleus.store.rdbms.mapping.datastore.ClobImpl;

import junit.framework.TestCase;

public class ClobImplTest extends TestCase
{

    public void testNull() throws SQLException, IOException
    {
        try
        {
            new ClobImpl(null);
        }
        catch(IllegalArgumentException ex)
        {
            return;
        }
        fail("expected IllegalArgumentException");
    }

    public void testLength() throws SQLException, IOException
    {
        assertEquals("test string".length(),new ClobImpl("test string").length());
    }

    public void testGetSubString() throws SQLException, IOException
    {
        assertEquals("es",new ClobImpl("test string").getSubString(2, 2));
    }

}
