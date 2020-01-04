# Glide
Glide is a fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interface.

### Glide

```glide

repositories {
  mavenCentral()
  google()
}

dependencies {
  implementation 'com.github.bumptech.glide:glide:4.10.0'
  annotationProcessor 'com.github.bumptech.glide:compiler:4.10.0'
}

```

### Glide Image Load 

```java

Glide.with(context)
 .load(movies.getMovieImages())
 .centerCrop()
 .placeholder(R.drawable.ic_launcher_background)
 .into(holder.imageView);

```




## Work Done!
