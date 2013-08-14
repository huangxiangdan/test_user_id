test_user_id
============

test_user_id, a demo to find out what will happen when you write a function named getUserId in which class extends Application, in android 4.3 only.


1. run the demo
2. drag the widget to your lancher
3. click "set user id" button
4. again, drag the widget to your lancher(what happened? crashed)
5. then, click "clear user id" button
6. ok, everything is ok now


The all thing is that, Android SDK v18 defined a function named "getUserId" in ContextWrapper.java, it's the base class of Application. That means, you override the framework function, it's **dangerous**.

but, no one tell us this.Not the android document nor the API reference.
