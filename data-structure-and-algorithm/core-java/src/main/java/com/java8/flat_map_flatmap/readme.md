Differences between Java 8 Map() Vs flatMap() :

map()
It processes stream of values.	
It does only mapping.	
It’s mapper function produces single value for each input value.	
It is a One-To-One mapping.	
Data Transformation : From Stream to Stream	
Use this method when the mapper function is producing a single value for each input value.	

flatMap()
It processes stream of stream of values.
It performs mapping as well as flattening.
It’s mapper function produces multiple values for each input value.
It is a One-To-Many mapping.
Data Transformation : From Stream<Stream to Stream
Use this method when the mapper function is producing multiple values for each input value.