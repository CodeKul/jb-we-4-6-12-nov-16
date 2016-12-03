package com.codekul.jb.innerclass;

/**
 * Created by aniruddha on 3/12/16.
 */
public class Outer {

    private int outerInt;

    public class PublicInner {

        private int innerInt;

        public void accessOuter(){
            outerInt = 10;
        }
    }

    private class PrivateInner {
    }

    public static class StaticInner {
        public void staticInnerMethod(){
        }
    }

    public void outerMethod() {

        final class LocalInner {
            public void localInnerMethod() {
            }
        }

        LocalInner inner = new LocalInner();
        inner.localInnerMethod();
    }

}
