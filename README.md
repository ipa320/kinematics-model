# kinematics-model

`Ecore` class diagram   

![Screenshot from 2021-05-11 19-29-52](https://user-images.githubusercontent.com/31062848/117983100-ea926280-b336-11eb-964a-6a50a2a0f8a9.png)

Example of the `urdf` xtext:
```
robot ur5 {
  root_link link base_link
  joints {
    joint shoulder_pan_joint {
      parent base_link
      child link shoulder_link
    }
  }	
}
```
and the corresponding generated `urdf`
```
<robot name="ur5">
  <!-- ur5 robot links and joints and more -->
  
  <link name="base_link">
  </link>
  
  <joint name="shoulder_pan_joint">
      <parent link="base_link"/>
      <child link="shoulder_link"/>
  </joint>
  
  <link name="shoulder_link">
  </link>
</robot>
```
