## URDF model example

```
RobotType { name Test
	joint { Joint {
		name joint_1
		type fixed
		parent Parent { link link_1 }
		child Child { link link_2 }
	}}

	link { Link { name link_1 } }
}
```