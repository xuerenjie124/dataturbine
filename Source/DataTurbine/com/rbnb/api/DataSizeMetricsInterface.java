/*
Copyright 2007 Creare Inc.

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
*/

package com.rbnb.api;

/**
 * Interface for objects from which data size metrics can be retrieved.
 * <p>
 *
 * @author Ian Brown
 *
 * @since V2.0
 * @version 11/19/2002
 */

/*
 * Copyright 2002 Creare Inc.
 * All Rights Reserved
 *
 *   Date      By	Description
 * MM/DD/YYYY
 * ----------  --	-----------
 * 11/19/2002  INB	Created.
 *
 */
interface DataSizeMetricsInterface {

    /**
     * Calculates the cache and archive data sizes in bytes.
     * <p>
     *
     * @author Ian Brown
     *
     * @param cacheDSIO   the cache data size.
     * @param archiveDSIO the archive data size.
     * @since V2.0
     * @version 11/19/2002
     */

    /*
     *
     *   Date      By	Description
     * MM/DD/YYYY
     * ----------  --	-----------
     * 11/19/2002  INB	Created.
     *
     */
    public abstract void calculateDataSizes(long[] cacheDSIO,
					    long[] archiveDSIO);
}
