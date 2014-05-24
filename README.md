# To use:

1. Copy the project
2. Delete the git folder and reinit
3. Find and replace all instances of "com.example"
4. Edit `build.properties` if you need to
5. Resolve
6. Run `ant script`

The compile target doesn't resolve.
Be sure to resolve after you edit ivy.xml or after you clean.

To make things happen right away, check prereqs, clone, then run:

    ant resolve && ant script && ./dist/app

# Prereqs

1. You need:
 - java 8
 - ant 1.9+
 - ivy 2.3+

2. Make sure java and ant are in your path.
3. Make sure the ivy jars are in ant's classpath (ie, in one of ant's lib folders, `$HOME/.ant/lib` is a good choice).
