scala-python-example
====================

A simple working example of calling Python from Scala using Jep inside an SBT build environment.

Uses jep.jar and libjep.so compiled from https://github.com/mrj0/jep. Note that we rename "jep.so" to "libjep.so".

You may need to run this before sbt for everything to work:
```bash
export LD_PRELOAD=/usr/lib/libpython2.7.so.1.0
```
