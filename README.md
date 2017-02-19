# Android_DataBinding

The steps to enable data binding in Android Studio 2.2:

1. Enable data binding in build.grade file and re-sync.

 dataBinding {
  enabled = true;
  }

2. Enclose layout with <layout> tags as the root tag to the UI.

3. Create a binding instance.

 Example: if main class is class MainActivity:

  create a class variable like this:

   ActivityMainBinding mBinding;

4. Set the content view using DatabindingUtil

 For example in OnCreate():

  mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

5. Bind each attribute in the views to the corresponding data.

 For example:

  For a TextView UI component with an id of TextViewName, bind data to the textview like this:

   String name = "Jon Doe";
   mBinding.textViewName.setText(Name);
