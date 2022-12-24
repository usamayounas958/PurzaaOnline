<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Login">

    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp"
        android:gravity="center"
        android:text="@string/Login"
        android:fontFamily="@font/poppinsbold"
        android:textSize="30sp"
        app:layout_constraintBottom_toTopOf="@+id/constraintLayout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.527"
        tools:targetApi="jelly_bean" />

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/constraintLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.426"
        tools:layout_editor_absoluteX="0dp">

        <com.google.android.material.textfield.TextInputLayout
            android:id="@+id/textInputLayoutUsername"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="30dp"
            android:layout_marginRight="30dp"
            android:hint="@string/username"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.0"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/username"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:drawableEnd="@drawable/user"
                android:fontFamily="@font/poppinsbold"
                tools:targetApi="jelly_bean" />
        </com.google.android.material.textfield.TextInputLayout>

        <com.google.android.material.textfield.TextInputLayout
            android:id="@+id/textInputLayoutPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="30dp"
            android:layout_marginRight="30dp"
            android:fontFamily="@font/poppinsbold"
            android:hint="@string/password"
            app:layout_constraintTop_toBottomOf="@+id/textInputLayoutUsername"
            tools:layout_editor_absoluteX="0dp">

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/password"
                android:layout_width="match_parent"
                android:layout_height="66dp"
                android:drawableEnd="@drawable/lock"
                tools:targetApi="jelly_bean" />
        </com.google.android.material.textfield.TextInputLayout>

        <ProgressBar
            android:id="@+id/progress"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:visibility="gone"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textInputLayoutPassword" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <TextView
        android:id="@+id/signUpText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/poppinsbold"
        android:text="@string/signuphere"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/buttonLogin"
        app:layout_constraintVertical_bias="0.247"
        tools:targetApi="jelly_bean" />

    <Button
        android:id="@+id/buttonLogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/poppinsbold"
        android:text="@string/login"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/constraintLayout"
        app:layout_constraintVertical_bias="0.228" />

</androidx.constraintlayout.widget.ConstraintLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              