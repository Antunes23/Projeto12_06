����   7 T  Exemplos  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LExemplos; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  [[I
     java/lang/Math ! " random ()D@�@     
  & ' ( round (D)J	  * + , out Ljava/io/PrintStream;   . / 0 makeConcatWithConstants (I)Ljava/lang/String;
 2 4 3 java/io/PrintStream 5 6 println (Ljava/lang/String;)V
  8 9  close args [Ljava/lang/String; ler Ljava/util/Scanner; m i I j StackMapTable 
SourceFile Exemplos.java BootstrapMethods
 G I H $java/lang/invoke/StringConcatFactory / J �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; F M  Os valores são  InnerClasses P %java/lang/invoke/MethodHandles$Lookup R java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      >     |� Y� � L� M>� &6� ,2�  #k� %�O�������>� 56� ",2.p� � ),2.� -  � 1����+� 7���̱    
   >        
     .  7 
 ?  D  J  U  f  o  s  {     H    | : ;    q < =   j >    + ? @    A @  A : ? @  G ( A @  B    	�   � � 	� �   C    D E     K  L N   
  O Q S 