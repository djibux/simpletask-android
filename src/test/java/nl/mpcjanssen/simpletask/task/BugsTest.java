package nl.mpcjanssen.simpletask.task;

import junit.framework.TestCase;
import nl.mpcjanssen.simpletask.ActiveFilter;
import nl.mpcjanssen.simpletask.sort.MultiComparator;
import nl.mpcjanssen.simpletask.util.Util;

/**
 * Tests to guard against bug regressions.
 */
public class BugsTest extends TestCase {

    public void testBuga7248d85e () {
        // Even though tasks below is not technically formatted
        // correctly it should not be changed in the file
        String taskContents = "x test";
        Task t = new Task(taskContents);
        assertEquals(taskContents, t.inFileFormat());
    }

    public void testActiveSortNullCrash() {
        ActiveFilter f = new ActiveFilter("test");
        MultiComparator mc =  new MultiComparator(f.getSort(null), Util.getTodayAsString(),true, false);
        assertNotNull(mc);
    }

    public void testBug50() {
        Task t = new Task("2012-01-01 @list test");
        assertEquals("test",t.showParts(~TToken.LIST & ~TToken.CREATION_DATE).trim());
        
    }

    // https://github.com/mpcjanssen/simpletask-android/issues/367
    public void testBug367() {
        Task t = new Task("Test due:2010-10-10 t:2010-11-11" );
        t.setDueDate("");
        t.setThresholdDate("");
        assertEquals(null, t.getDueDate());
        assertEquals(null, t.getThresholdDate());
    }
}
