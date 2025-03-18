package XII;

import java.util.*;
public class revr
{
    int rev(int n)
    {
        int r=0;
        while(n>0)
        {
            int q=n%10;
            r=r*10+q;
            n=n/10;
        }
        return r;
    }
}
