����   7 d  Exemplo4  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LExemplo4; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  [[I
     java/lang/Math ! " random ()D@Y      
  & ' ( round (D)J
  * +  close	  - . / out Ljava/io/PrintStream; 1 Matriz A
 3 5 4 java/io/PrintStream 6 7 println (Ljava/lang/String;)V   9 : ; makeConcatWithConstants (I)Ljava/lang/String;
 3 = > 7 print @  
............................... B 
Matriz B    9 E 
Matriz C    9 args [Ljava/lang/String; ler Ljava/util/Scanner; a b c i I j StackMapTable H 
SourceFile Exemplo4.java BootstrapMethods
 W Y X $java/lang/invoke/StringConcatFactory : Z �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; V ] [] InnerClasses ` %java/lang/invoke/MethodHandles$Lookup b java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      �    @� Y� � L� M� N� :6� T6� E,2�  #k� %�O-2�  #k� %�O2,2.-2.hO+� )��������� ,0� 26� /6� � ,,2.� 8  � <���� ,?� 2���Ѳ ,A� 26� /6� � ,-2.� C  � <���� ,?� 2���Ѳ ,D� 26� 06� � ,2.� F  � <���� ,?� 2���б    
   � "     
     !  '  -  ?  Q  h  l  u  ~  �  �  �  �  �  �  �  �   � ! � " � ! � $ �   � & ' ( )% (. ,6 '? .    �   @ G H   5 I J  . K   ' L   ! M   $ Z N O  * K P O  � 5 N O  �  P O  � 5 N O  �  P O 	 6 N O   P O  Q   > � '  R      � � A� � � � � � �   S    T U     [  \ [  \ [  \ ^   
  _ a c 