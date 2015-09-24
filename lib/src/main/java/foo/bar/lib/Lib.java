package foo.bar.lib;

import org.apache.commons.lang.WordUtils;

/**
 * Hello world!
 *
 */
public class Lib 
{
    public static void fixString( 
    		final String str)
    {
        System.out.println( WordUtils.capitalizeFully(str) );
    }
}
