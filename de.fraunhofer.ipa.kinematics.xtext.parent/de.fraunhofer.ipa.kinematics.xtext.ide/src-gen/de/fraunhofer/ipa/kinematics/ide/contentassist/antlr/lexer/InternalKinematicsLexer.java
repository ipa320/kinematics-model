package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsLexer extends Lexer {
    public static final int Origin=26;
    public static final int Lower=37;
    public static final int RULE_BEGIN=69;
    public static final int Distro=23;
    public static final int Size=47;
    public static final int Effort=24;
    public static final int Ixx=50;
    public static final int RULE_BOOLEAN=63;
    public static final int Ixz=52;
    public static final int Ixy=51;
    public static final int Name=45;
    public static final int Sphere=30;
    public static final int Version=21;
    public static final int Child=33;
    public static final int RightSquareBracket=61;
    public static final int RULE_ID=72;
    public static final int Iyy=53;
    public static final int Filename=13;
    public static final int Mesh=44;
    public static final int RULE_DIGIT=62;
    public static final int Box=49;
    public static final int Iyz=54;
    public static final int Joint=35;
    public static final int Mass=43;
    public static final int BaseLink=10;
    public static final int AnyURI=32;
    public static final int Repo=46;
    public static final int RULE_INT=64;
    public static final int Value=40;
    public static final int RULE_ML_COMMENT=74;
    public static final int Inertia=19;
    public static final int LeftSquareBracket=60;
    public static final int Package=20;
    public static final int EndLink=17;
    public static final int Link=42;
    public static final int Radius=29;
    public static final int Group=34;
    public static final int RULE_END=70;
    public static final int Category=11;
    public static final int Parent=27;
    public static final int Izz=55;
    public static final int RULE_STRING=73;
    public static final int Prefix=28;
    public static final int RULE_SL_COMMENT=71;
    public static final int BaseAttachment=5;
    public static final int Comma=58;
    public static final int HyphenMinus=59;
    public static final int RULE_CATEGORY=68;
    public static final int GitRepo=18;
    public static final int RULE_DOUBLE=65;
    public static final int Branch=22;
    public static final int Rpy=56;
    public static final int RULE_JOINTTYPE=67;
    public static final int RULE_DECINT=66;
    public static final int Component=9;
    public static final int EOF=-1;
    public static final int Visual=31;
    public static final int Axis=41;
    public static final int Upper=39;
    public static final int RULE_WS=75;
    public static final int Collision=8;
    public static final int Connection=7;
    public static final int Ros2_control=6;
    public static final int Scale=38;
    public static final int Inertial=15;
    public static final int RULE_ANY_OTHER=76;
    public static final int Velocity=16;
    public static final int Geometry=14;
    public static final int Cylinder=12;
    public static final int FlangeAttachment=4;
    public static final int Type=48;
    public static final int Length=25;
    public static final int Xyz=57;
    public static final int Limit=36;

    // delegates
    // delegators

    public InternalKinematicsLexer() {;} 
    public InternalKinematicsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKinematicsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKinematicsLexer.g"; }

    // $ANTLR start "FlangeAttachment"
    public final void mFlangeAttachment() throws RecognitionException {
        try {
            int _type = FlangeAttachment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:14:18: ( 'flangeAttachment:' )
            // InternalKinematicsLexer.g:14:20: 'flangeAttachment:'
            {
            match("flangeAttachment:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FlangeAttachment"

    // $ANTLR start "BaseAttachment"
    public final void mBaseAttachment() throws RecognitionException {
        try {
            int _type = BaseAttachment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:16:16: ( 'baseAttachment:' )
            // InternalKinematicsLexer.g:16:18: 'baseAttachment:'
            {
            match("baseAttachment:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BaseAttachment"

    // $ANTLR start "Ros2_control"
    public final void mRos2_control() throws RecognitionException {
        try {
            int _type = Ros2_control;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:18:14: ( 'ros2_control:' )
            // InternalKinematicsLexer.g:18:16: 'ros2_control:'
            {
            match("ros2_control:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ros2_control"

    // $ANTLR start "Connection"
    public final void mConnection() throws RecognitionException {
        try {
            int _type = Connection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:20:12: ( 'connection:' )
            // InternalKinematicsLexer.g:20:14: 'connection:'
            {
            match("connection:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Connection"

    // $ANTLR start "Collision"
    public final void mCollision() throws RecognitionException {
        try {
            int _type = Collision;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:22:11: ( 'collision:' )
            // InternalKinematicsLexer.g:22:13: 'collision:'
            {
            match("collision:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Collision"

    // $ANTLR start "Component"
    public final void mComponent() throws RecognitionException {
        try {
            int _type = Component;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:24:11: ( 'component:' )
            // InternalKinematicsLexer.g:24:13: 'component:'
            {
            match("component:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Component"

    // $ANTLR start "BaseLink"
    public final void mBaseLink() throws RecognitionException {
        try {
            int _type = BaseLink;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:26:10: ( 'baseLink:' )
            // InternalKinematicsLexer.g:26:12: 'baseLink:'
            {
            match("baseLink:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BaseLink"

    // $ANTLR start "Category"
    public final void mCategory() throws RecognitionException {
        try {
            int _type = Category;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:28:10: ( 'category:' )
            // InternalKinematicsLexer.g:28:12: 'category:'
            {
            match("category:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Category"

    // $ANTLR start "Cylinder"
    public final void mCylinder() throws RecognitionException {
        try {
            int _type = Cylinder;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:30:10: ( 'cylinder:' )
            // InternalKinematicsLexer.g:30:12: 'cylinder:'
            {
            match("cylinder:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cylinder"

    // $ANTLR start "Filename"
    public final void mFilename() throws RecognitionException {
        try {
            int _type = Filename;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:32:10: ( 'filename:' )
            // InternalKinematicsLexer.g:32:12: 'filename:'
            {
            match("filename:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Filename"

    // $ANTLR start "Geometry"
    public final void mGeometry() throws RecognitionException {
        try {
            int _type = Geometry;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:34:10: ( 'geometry:' )
            // InternalKinematicsLexer.g:34:12: 'geometry:'
            {
            match("geometry:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Geometry"

    // $ANTLR start "Inertial"
    public final void mInertial() throws RecognitionException {
        try {
            int _type = Inertial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:36:10: ( 'inertial:' )
            // InternalKinematicsLexer.g:36:12: 'inertial:'
            {
            match("inertial:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inertial"

    // $ANTLR start "Velocity"
    public final void mVelocity() throws RecognitionException {
        try {
            int _type = Velocity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:38:10: ( 'velocity:' )
            // InternalKinematicsLexer.g:38:12: 'velocity:'
            {
            match("velocity:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Velocity"

    // $ANTLR start "EndLink"
    public final void mEndLink() throws RecognitionException {
        try {
            int _type = EndLink;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:40:9: ( 'endLink:' )
            // InternalKinematicsLexer.g:40:11: 'endLink:'
            {
            match("endLink:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EndLink"

    // $ANTLR start "GitRepo"
    public final void mGitRepo() throws RecognitionException {
        try {
            int _type = GitRepo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:42:9: ( 'gitRepo:' )
            // InternalKinematicsLexer.g:42:11: 'gitRepo:'
            {
            match("gitRepo:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GitRepo"

    // $ANTLR start "Inertia"
    public final void mInertia() throws RecognitionException {
        try {
            int _type = Inertia;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:44:9: ( 'inertia:' )
            // InternalKinematicsLexer.g:44:11: 'inertia:'
            {
            match("inertia:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inertia"

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:46:9: ( 'package:' )
            // InternalKinematicsLexer.g:46:11: 'package:'
            {
            match("package:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Package"

    // $ANTLR start "Version"
    public final void mVersion() throws RecognitionException {
        try {
            int _type = Version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:48:9: ( 'version:' )
            // InternalKinematicsLexer.g:48:11: 'version:'
            {
            match("version:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Version"

    // $ANTLR start "Branch"
    public final void mBranch() throws RecognitionException {
        try {
            int _type = Branch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:50:8: ( 'branch:' )
            // InternalKinematicsLexer.g:50:10: 'branch:'
            {
            match("branch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Branch"

    // $ANTLR start "Distro"
    public final void mDistro() throws RecognitionException {
        try {
            int _type = Distro;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:52:8: ( 'distro:' )
            // InternalKinematicsLexer.g:52:10: 'distro:'
            {
            match("distro:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Distro"

    // $ANTLR start "Effort"
    public final void mEffort() throws RecognitionException {
        try {
            int _type = Effort;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:54:8: ( 'effort:' )
            // InternalKinematicsLexer.g:54:10: 'effort:'
            {
            match("effort:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Effort"

    // $ANTLR start "Length"
    public final void mLength() throws RecognitionException {
        try {
            int _type = Length;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:56:8: ( 'length:' )
            // InternalKinematicsLexer.g:56:10: 'length:'
            {
            match("length:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Length"

    // $ANTLR start "Origin"
    public final void mOrigin() throws RecognitionException {
        try {
            int _type = Origin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:58:8: ( 'origin:' )
            // InternalKinematicsLexer.g:58:10: 'origin:'
            {
            match("origin:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Origin"

    // $ANTLR start "Parent"
    public final void mParent() throws RecognitionException {
        try {
            int _type = Parent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:60:8: ( 'parent:' )
            // InternalKinematicsLexer.g:60:10: 'parent:'
            {
            match("parent:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parent"

    // $ANTLR start "Prefix"
    public final void mPrefix() throws RecognitionException {
        try {
            int _type = Prefix;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:62:8: ( 'prefix:' )
            // InternalKinematicsLexer.g:62:10: 'prefix:'
            {
            match("prefix:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Prefix"

    // $ANTLR start "Radius"
    public final void mRadius() throws RecognitionException {
        try {
            int _type = Radius;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:64:8: ( 'radius:' )
            // InternalKinematicsLexer.g:64:10: 'radius:'
            {
            match("radius:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Radius"

    // $ANTLR start "Sphere"
    public final void mSphere() throws RecognitionException {
        try {
            int _type = Sphere;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:66:8: ( 'sphere:' )
            // InternalKinematicsLexer.g:66:10: 'sphere:'
            {
            match("sphere:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sphere"

    // $ANTLR start "Visual"
    public final void mVisual() throws RecognitionException {
        try {
            int _type = Visual;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:68:8: ( 'visual:' )
            // InternalKinematicsLexer.g:68:10: 'visual:'
            {
            match("visual:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Visual"

    // $ANTLR start "AnyURI"
    public final void mAnyURI() throws RecognitionException {
        try {
            int _type = AnyURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:70:8: ( 'AnyURI' )
            // InternalKinematicsLexer.g:70:10: 'AnyURI'
            {
            match("AnyURI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AnyURI"

    // $ANTLR start "Child"
    public final void mChild() throws RecognitionException {
        try {
            int _type = Child;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:72:7: ( 'child:' )
            // InternalKinematicsLexer.g:72:9: 'child:'
            {
            match("child:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Child"

    // $ANTLR start "Group"
    public final void mGroup() throws RecognitionException {
        try {
            int _type = Group;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:74:7: ( 'group:' )
            // InternalKinematicsLexer.g:74:9: 'group:'
            {
            match("group:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Group"

    // $ANTLR start "Joint"
    public final void mJoint() throws RecognitionException {
        try {
            int _type = Joint;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:76:7: ( 'joint:' )
            // InternalKinematicsLexer.g:76:9: 'joint:'
            {
            match("joint:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Joint"

    // $ANTLR start "Limit"
    public final void mLimit() throws RecognitionException {
        try {
            int _type = Limit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:78:7: ( 'limit:' )
            // InternalKinematicsLexer.g:78:9: 'limit:'
            {
            match("limit:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Limit"

    // $ANTLR start "Lower"
    public final void mLower() throws RecognitionException {
        try {
            int _type = Lower;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:80:7: ( 'lower:' )
            // InternalKinematicsLexer.g:80:9: 'lower:'
            {
            match("lower:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lower"

    // $ANTLR start "Scale"
    public final void mScale() throws RecognitionException {
        try {
            int _type = Scale;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:82:7: ( 'scale:' )
            // InternalKinematicsLexer.g:82:9: 'scale:'
            {
            match("scale:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scale"

    // $ANTLR start "Upper"
    public final void mUpper() throws RecognitionException {
        try {
            int _type = Upper;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:84:7: ( 'upper:' )
            // InternalKinematicsLexer.g:84:9: 'upper:'
            {
            match("upper:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Upper"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:86:7: ( 'value:' )
            // InternalKinematicsLexer.g:86:9: 'value:'
            {
            match("value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Axis"
    public final void mAxis() throws RecognitionException {
        try {
            int _type = Axis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:88:6: ( 'axis:' )
            // InternalKinematicsLexer.g:88:8: 'axis:'
            {
            match("axis:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Axis"

    // $ANTLR start "Link"
    public final void mLink() throws RecognitionException {
        try {
            int _type = Link;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:90:6: ( 'link:' )
            // InternalKinematicsLexer.g:90:8: 'link:'
            {
            match("link:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Link"

    // $ANTLR start "Mass"
    public final void mMass() throws RecognitionException {
        try {
            int _type = Mass;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:92:6: ( 'mass:' )
            // InternalKinematicsLexer.g:92:8: 'mass:'
            {
            match("mass:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mass"

    // $ANTLR start "Mesh"
    public final void mMesh() throws RecognitionException {
        try {
            int _type = Mesh;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:94:6: ( 'mesh:' )
            // InternalKinematicsLexer.g:94:8: 'mesh:'
            {
            match("mesh:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mesh"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:96:6: ( 'name:' )
            // InternalKinematicsLexer.g:96:8: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Repo"
    public final void mRepo() throws RecognitionException {
        try {
            int _type = Repo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:98:6: ( 'repo:' )
            // InternalKinematicsLexer.g:98:8: 'repo:'
            {
            match("repo:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Repo"

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:100:6: ( 'size:' )
            // InternalKinematicsLexer.g:100:8: 'size:'
            {
            match("size:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:102:6: ( 'type:' )
            // InternalKinematicsLexer.g:102:8: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Box"
    public final void mBox() throws RecognitionException {
        try {
            int _type = Box;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:104:5: ( 'box:' )
            // InternalKinematicsLexer.g:104:7: 'box:'
            {
            match("box:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Box"

    // $ANTLR start "Ixx"
    public final void mIxx() throws RecognitionException {
        try {
            int _type = Ixx;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:106:5: ( 'ixx:' )
            // InternalKinematicsLexer.g:106:7: 'ixx:'
            {
            match("ixx:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ixx"

    // $ANTLR start "Ixy"
    public final void mIxy() throws RecognitionException {
        try {
            int _type = Ixy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:108:5: ( 'ixy:' )
            // InternalKinematicsLexer.g:108:7: 'ixy:'
            {
            match("ixy:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ixy"

    // $ANTLR start "Ixz"
    public final void mIxz() throws RecognitionException {
        try {
            int _type = Ixz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:110:5: ( 'ixz:' )
            // InternalKinematicsLexer.g:110:7: 'ixz:'
            {
            match("ixz:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ixz"

    // $ANTLR start "Iyy"
    public final void mIyy() throws RecognitionException {
        try {
            int _type = Iyy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:112:5: ( 'iyy:' )
            // InternalKinematicsLexer.g:112:7: 'iyy:'
            {
            match("iyy:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Iyy"

    // $ANTLR start "Iyz"
    public final void mIyz() throws RecognitionException {
        try {
            int _type = Iyz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:114:5: ( 'iyz:' )
            // InternalKinematicsLexer.g:114:7: 'iyz:'
            {
            match("iyz:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Iyz"

    // $ANTLR start "Izz"
    public final void mIzz() throws RecognitionException {
        try {
            int _type = Izz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:116:5: ( 'izz:' )
            // InternalKinematicsLexer.g:116:7: 'izz:'
            {
            match("izz:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Izz"

    // $ANTLR start "Rpy"
    public final void mRpy() throws RecognitionException {
        try {
            int _type = Rpy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:118:5: ( 'rpy:' )
            // InternalKinematicsLexer.g:118:7: 'rpy:'
            {
            match("rpy:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rpy"

    // $ANTLR start "Xyz"
    public final void mXyz() throws RecognitionException {
        try {
            int _type = Xyz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:120:5: ( 'xyz:' )
            // InternalKinematicsLexer.g:120:7: 'xyz:'
            {
            match("xyz:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xyz"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:122:7: ( ',' )
            // InternalKinematicsLexer.g:122:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:124:13: ( '-' )
            // InternalKinematicsLexer.g:124:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:126:19: ( '[' )
            // InternalKinematicsLexer.g:126:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:128:20: ( ']' )
            // InternalKinematicsLexer.g:128:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalKinematicsLexer.g:130:21: ( '0' .. '9' )
            // InternalKinematicsLexer.g:130:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:132:14: ( ( 'true' | 'false' ) )
            // InternalKinematicsLexer.g:132:16: ( 'true' | 'false' )
            {
            // InternalKinematicsLexer.g:132:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematicsLexer.g:132:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:132:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:134:13: ( ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? ( ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )? )
            // InternalKinematicsLexer.g:134:15: ( '-' )? ( RULE_INT )* ( '.' ( RULE_INT )+ )? ( ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )?
            {
            // InternalKinematicsLexer.g:134:15: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematicsLexer.g:134:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalKinematicsLexer.g:134:20: ( RULE_INT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKinematicsLexer.g:134:20: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalKinematicsLexer.g:134:30: ( '.' ( RULE_INT )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematicsLexer.g:134:31: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalKinematicsLexer.g:134:35: ( RULE_INT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:134:35: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // InternalKinematicsLexer.g:134:47: ( ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematicsLexer.g:134:48: ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:136:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalKinematicsLexer.g:136:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalKinematicsLexer.g:136:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt9=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt9=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt9=2;
                }
                break;
            case '-':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKinematicsLexer.g:136:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:136:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalKinematicsLexer.g:136:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:136:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalKinematicsLexer.g:136:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalKinematicsLexer.g:136:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:136:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_JOINTTYPE"
    public final void mRULE_JOINTTYPE() throws RecognitionException {
        try {
            int _type = RULE_JOINTTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:138:16: ( ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' ) )
            // InternalKinematicsLexer.g:138:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            {
            // InternalKinematicsLexer.g:138:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt10=1;
                }
                break;
            case 'c':
                {
                alt10=2;
                }
                break;
            case 'p':
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3=='r') ) {
                    alt10=3;
                }
                else if ( (LA10_3=='l') ) {
                    alt10=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'f':
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4=='i') ) {
                    alt10=4;
                }
                else if ( (LA10_4=='l') ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKinematicsLexer.g:138:19: 'revolute'
                    {
                    match("revolute"); 


                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:138:30: 'continuous'
                    {
                    match("continuous"); 


                    }
                    break;
                case 3 :
                    // InternalKinematicsLexer.g:138:43: 'prismatic'
                    {
                    match("prismatic"); 


                    }
                    break;
                case 4 :
                    // InternalKinematicsLexer.g:138:55: 'fixed'
                    {
                    match("fixed"); 


                    }
                    break;
                case 5 :
                    // InternalKinematicsLexer.g:138:63: 'floating'
                    {
                    match("floating"); 


                    }
                    break;
                case 6 :
                    // InternalKinematicsLexer.g:138:74: 'planar'
                    {
                    match("planar"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JOINTTYPE"

    // $ANTLR start "RULE_CATEGORY"
    public final void mRULE_CATEGORY() throws RecognitionException {
        try {
            int _type = RULE_CATEGORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:140:15: ( ( 'manipulator' | 'gripper' | 'camera' ) )
            // InternalKinematicsLexer.g:140:17: ( 'manipulator' | 'gripper' | 'camera' )
            {
            // InternalKinematicsLexer.g:140:17: ( 'manipulator' | 'gripper' | 'camera' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 'm':
                {
                alt11=1;
                }
                break;
            case 'g':
                {
                alt11=2;
                }
                break;
            case 'c':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKinematicsLexer.g:140:18: 'manipulator'
                    {
                    match("manipulator"); 


                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:140:32: 'gripper'
                    {
                    match("gripper"); 


                    }
                    break;
                case 3 :
                    // InternalKinematicsLexer.g:140:42: 'camera'
                    {
                    match("camera"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CATEGORY"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalKinematicsLexer.g:142:21: ()
            // InternalKinematicsLexer.g:142:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalKinematicsLexer.g:144:19: ()
            // InternalKinematicsLexer.g:144:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:146:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalKinematicsLexer.g:146:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalKinematicsLexer.g:146:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKinematicsLexer.g:146:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:148:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKinematicsLexer.g:148:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKinematicsLexer.g:148:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKinematicsLexer.g:148:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKinematicsLexer.g:148:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKinematicsLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalKinematicsLexer.g:150:19: ( ( '0' .. '9' )+ )
            // InternalKinematicsLexer.g:150:21: ( '0' .. '9' )+
            {
            // InternalKinematicsLexer.g:150:21: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKinematicsLexer.g:150:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:152:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKinematicsLexer.g:152:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKinematicsLexer.g:152:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalKinematicsLexer.g:152:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKinematicsLexer.g:152:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:152:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematicsLexer.g:152:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:152:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKinematicsLexer.g:152:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:152:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematicsLexer.g:152:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:154:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKinematicsLexer.g:154:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKinematicsLexer.g:154:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKinematicsLexer.g:154:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:156:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKinematicsLexer.g:156:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKinematicsLexer.g:156:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKinematicsLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:158:16: ( . )
            // InternalKinematicsLexer.g:158:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKinematicsLexer.g:1:8: ( FlangeAttachment | BaseAttachment | Ros2_control | Connection | Collision | Component | BaseLink | Category | Cylinder | Filename | Geometry | Inertial | Velocity | EndLink | GitRepo | Inertia | Package | Version | Branch | Distro | Effort | Length | Origin | Parent | Prefix | Radius | Sphere | Visual | AnyURI | Child | Group | Joint | Limit | Lower | Scale | Upper | Value | Axis | Link | Mass | Mesh | Name | Repo | Size | Type | Box | Ixx | Ixy | Ixz | Iyy | Iyz | Izz | Rpy | Xyz | Comma | HyphenMinus | LeftSquareBracket | RightSquareBracket | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_CATEGORY | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=69;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalKinematicsLexer.g:1:10: FlangeAttachment
                {
                mFlangeAttachment(); 

                }
                break;
            case 2 :
                // InternalKinematicsLexer.g:1:27: BaseAttachment
                {
                mBaseAttachment(); 

                }
                break;
            case 3 :
                // InternalKinematicsLexer.g:1:42: Ros2_control
                {
                mRos2_control(); 

                }
                break;
            case 4 :
                // InternalKinematicsLexer.g:1:55: Connection
                {
                mConnection(); 

                }
                break;
            case 5 :
                // InternalKinematicsLexer.g:1:66: Collision
                {
                mCollision(); 

                }
                break;
            case 6 :
                // InternalKinematicsLexer.g:1:76: Component
                {
                mComponent(); 

                }
                break;
            case 7 :
                // InternalKinematicsLexer.g:1:86: BaseLink
                {
                mBaseLink(); 

                }
                break;
            case 8 :
                // InternalKinematicsLexer.g:1:95: Category
                {
                mCategory(); 

                }
                break;
            case 9 :
                // InternalKinematicsLexer.g:1:104: Cylinder
                {
                mCylinder(); 

                }
                break;
            case 10 :
                // InternalKinematicsLexer.g:1:113: Filename
                {
                mFilename(); 

                }
                break;
            case 11 :
                // InternalKinematicsLexer.g:1:122: Geometry
                {
                mGeometry(); 

                }
                break;
            case 12 :
                // InternalKinematicsLexer.g:1:131: Inertial
                {
                mInertial(); 

                }
                break;
            case 13 :
                // InternalKinematicsLexer.g:1:140: Velocity
                {
                mVelocity(); 

                }
                break;
            case 14 :
                // InternalKinematicsLexer.g:1:149: EndLink
                {
                mEndLink(); 

                }
                break;
            case 15 :
                // InternalKinematicsLexer.g:1:157: GitRepo
                {
                mGitRepo(); 

                }
                break;
            case 16 :
                // InternalKinematicsLexer.g:1:165: Inertia
                {
                mInertia(); 

                }
                break;
            case 17 :
                // InternalKinematicsLexer.g:1:173: Package
                {
                mPackage(); 

                }
                break;
            case 18 :
                // InternalKinematicsLexer.g:1:181: Version
                {
                mVersion(); 

                }
                break;
            case 19 :
                // InternalKinematicsLexer.g:1:189: Branch
                {
                mBranch(); 

                }
                break;
            case 20 :
                // InternalKinematicsLexer.g:1:196: Distro
                {
                mDistro(); 

                }
                break;
            case 21 :
                // InternalKinematicsLexer.g:1:203: Effort
                {
                mEffort(); 

                }
                break;
            case 22 :
                // InternalKinematicsLexer.g:1:210: Length
                {
                mLength(); 

                }
                break;
            case 23 :
                // InternalKinematicsLexer.g:1:217: Origin
                {
                mOrigin(); 

                }
                break;
            case 24 :
                // InternalKinematicsLexer.g:1:224: Parent
                {
                mParent(); 

                }
                break;
            case 25 :
                // InternalKinematicsLexer.g:1:231: Prefix
                {
                mPrefix(); 

                }
                break;
            case 26 :
                // InternalKinematicsLexer.g:1:238: Radius
                {
                mRadius(); 

                }
                break;
            case 27 :
                // InternalKinematicsLexer.g:1:245: Sphere
                {
                mSphere(); 

                }
                break;
            case 28 :
                // InternalKinematicsLexer.g:1:252: Visual
                {
                mVisual(); 

                }
                break;
            case 29 :
                // InternalKinematicsLexer.g:1:259: AnyURI
                {
                mAnyURI(); 

                }
                break;
            case 30 :
                // InternalKinematicsLexer.g:1:266: Child
                {
                mChild(); 

                }
                break;
            case 31 :
                // InternalKinematicsLexer.g:1:272: Group
                {
                mGroup(); 

                }
                break;
            case 32 :
                // InternalKinematicsLexer.g:1:278: Joint
                {
                mJoint(); 

                }
                break;
            case 33 :
                // InternalKinematicsLexer.g:1:284: Limit
                {
                mLimit(); 

                }
                break;
            case 34 :
                // InternalKinematicsLexer.g:1:290: Lower
                {
                mLower(); 

                }
                break;
            case 35 :
                // InternalKinematicsLexer.g:1:296: Scale
                {
                mScale(); 

                }
                break;
            case 36 :
                // InternalKinematicsLexer.g:1:302: Upper
                {
                mUpper(); 

                }
                break;
            case 37 :
                // InternalKinematicsLexer.g:1:308: Value
                {
                mValue(); 

                }
                break;
            case 38 :
                // InternalKinematicsLexer.g:1:314: Axis
                {
                mAxis(); 

                }
                break;
            case 39 :
                // InternalKinematicsLexer.g:1:319: Link
                {
                mLink(); 

                }
                break;
            case 40 :
                // InternalKinematicsLexer.g:1:324: Mass
                {
                mMass(); 

                }
                break;
            case 41 :
                // InternalKinematicsLexer.g:1:329: Mesh
                {
                mMesh(); 

                }
                break;
            case 42 :
                // InternalKinematicsLexer.g:1:334: Name
                {
                mName(); 

                }
                break;
            case 43 :
                // InternalKinematicsLexer.g:1:339: Repo
                {
                mRepo(); 

                }
                break;
            case 44 :
                // InternalKinematicsLexer.g:1:344: Size
                {
                mSize(); 

                }
                break;
            case 45 :
                // InternalKinematicsLexer.g:1:349: Type
                {
                mType(); 

                }
                break;
            case 46 :
                // InternalKinematicsLexer.g:1:354: Box
                {
                mBox(); 

                }
                break;
            case 47 :
                // InternalKinematicsLexer.g:1:358: Ixx
                {
                mIxx(); 

                }
                break;
            case 48 :
                // InternalKinematicsLexer.g:1:362: Ixy
                {
                mIxy(); 

                }
                break;
            case 49 :
                // InternalKinematicsLexer.g:1:366: Ixz
                {
                mIxz(); 

                }
                break;
            case 50 :
                // InternalKinematicsLexer.g:1:370: Iyy
                {
                mIyy(); 

                }
                break;
            case 51 :
                // InternalKinematicsLexer.g:1:374: Iyz
                {
                mIyz(); 

                }
                break;
            case 52 :
                // InternalKinematicsLexer.g:1:378: Izz
                {
                mIzz(); 

                }
                break;
            case 53 :
                // InternalKinematicsLexer.g:1:382: Rpy
                {
                mRpy(); 

                }
                break;
            case 54 :
                // InternalKinematicsLexer.g:1:386: Xyz
                {
                mXyz(); 

                }
                break;
            case 55 :
                // InternalKinematicsLexer.g:1:390: Comma
                {
                mComma(); 

                }
                break;
            case 56 :
                // InternalKinematicsLexer.g:1:396: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 57 :
                // InternalKinematicsLexer.g:1:408: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 58 :
                // InternalKinematicsLexer.g:1:426: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 59 :
                // InternalKinematicsLexer.g:1:445: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 60 :
                // InternalKinematicsLexer.g:1:458: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 61 :
                // InternalKinematicsLexer.g:1:470: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 62 :
                // InternalKinematicsLexer.g:1:482: RULE_JOINTTYPE
                {
                mRULE_JOINTTYPE(); 

                }
                break;
            case 63 :
                // InternalKinematicsLexer.g:1:497: RULE_CATEGORY
                {
                mRULE_CATEGORY(); 

                }
                break;
            case 64 :
                // InternalKinematicsLexer.g:1:511: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // InternalKinematicsLexer.g:1:527: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 66 :
                // InternalKinematicsLexer.g:1:535: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 67 :
                // InternalKinematicsLexer.g:1:547: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // InternalKinematicsLexer.g:1:563: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 69 :
                // InternalKinematicsLexer.g:1:571: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\35\25\52\1\uffff\1\131\3\uffff\1\46\1\52\1\uffff\1\35\1\uffff\1\46\1\uffff\3\46\2\uffff\3\52\1\uffff\54\52\1\uffff\1\35\3\uffff\1\35\4\uffff\76\52\1\35\7\52\1\uffff\4\52\1\uffff\15\52\6\uffff\35\52\1\u0115\1\uffff\3\52\1\u0119\1\u0115\5\52\1\uffff\34\52\1\uffff\4\52\1\uffff\3\52\2\uffff\1\52\4\uffff\3\52\1\uffff\13\52\1\u0151\1\52\1\uffff\2\52\1\uffff\5\52\1\uffff\6\52\1\u0119\2\52\2\uffff\2\52\1\uffff\1\u0164\2\uffff\6\52\1\uffff\1\52\1\uffff\6\52\1\uffff\3\52\1\u0151\3\52\1\uffff\1\52\1\uffff\1\52\2\uffff\1\52\5\uffff\2\52\1\u0119\4\52\1\u0119\7\52\1\uffff\1\52\1\uffff\1\52\3\uffff\3\52\1\uffff\1\52\1\uffff\5\52\5\uffff\1\u0119\5\52\1\u0119\2\uffff\4\52\1\uffff\1\u0151\5\52\1\uffff\3\52\1\uffff\1\52\1\uffff";
    static final String DFA21_eofS =
        "\u01a6\uffff";
    static final String DFA21_minS =
        "\1\0\4\141\1\145\1\156\1\141\1\53\1\141\1\151\1\145\1\162\1\143\1\156\1\157\1\160\1\170\2\141\1\162\1\171\1\uffff\1\56\3\uffff\1\60\1\53\1\uffff\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\141\2\154\1\uffff\1\163\1\141\1\170\1\163\1\144\1\160\1\171\1\154\1\155\1\154\1\151\1\157\1\164\1\151\1\145\1\170\1\171\1\172\1\154\1\163\1\154\1\144\1\146\1\143\1\145\1\141\1\163\1\156\1\155\1\167\1\151\1\150\1\141\1\172\1\171\1\151\1\160\1\151\1\156\1\163\1\155\1\160\1\165\1\172\1\uffff\1\60\3\uffff\1\60\4\uffff\1\156\1\141\2\145\1\163\1\145\1\156\1\72\1\62\1\151\2\157\1\72\1\156\1\154\1\160\2\145\1\151\1\154\1\155\1\122\1\165\1\160\1\162\6\72\1\157\1\163\2\165\1\114\1\157\1\153\1\145\1\146\1\163\1\156\1\164\1\147\1\151\1\153\1\145\1\147\1\145\1\154\1\145\1\125\1\156\1\145\2\163\1\151\1\150\3\145\1\72\1\60\1\147\1\164\1\156\1\144\1\145\1\101\1\143\1\uffff\1\137\1\165\1\72\1\154\1\uffff\1\145\2\151\1\157\1\147\1\162\1\156\1\144\2\145\2\160\1\164\6\uffff\1\143\1\151\1\141\1\145\1\151\1\162\1\141\1\156\1\151\1\155\1\141\1\162\2\164\1\72\1\162\1\151\1\162\1\145\1\72\1\122\1\164\1\162\2\72\1\160\3\72\1\60\1\uffff\1\145\1\151\1\141\2\60\1\164\1\151\1\150\1\143\1\163\1\uffff\1\165\1\143\1\156\1\163\1\156\1\157\1\141\1\144\1\72\1\164\1\160\1\72\1\145\2\151\1\157\1\154\1\72\1\156\1\164\1\147\1\164\1\170\1\141\1\162\1\157\1\150\1\72\1\uffff\1\72\1\156\1\145\1\72\1\uffff\1\111\2\72\2\uffff\1\165\4\uffff\1\101\1\156\1\155\1\uffff\1\164\1\156\1\72\1\157\1\72\2\164\1\165\1\151\1\145\1\162\1\60\1\145\1\uffff\1\162\1\157\1\uffff\1\162\1\141\1\164\1\156\1\72\1\uffff\1\153\1\72\1\145\2\72\1\164\1\60\2\72\2\uffff\2\72\1\uffff\1\60\2\uffff\1\154\1\164\1\147\1\145\1\141\1\153\1\uffff\1\156\1\uffff\1\145\1\151\2\157\1\156\1\171\1\uffff\1\162\1\171\1\72\1\60\1\72\1\171\1\72\1\uffff\1\72\1\uffff\1\72\2\uffff\1\151\5\uffff\1\141\1\164\1\60\1\72\1\143\1\72\1\164\1\60\1\157\1\165\1\156\1\164\3\72\1\uffff\1\72\1\uffff\1\72\3\uffff\1\143\1\164\1\141\1\uffff\1\150\1\uffff\1\162\1\156\1\163\2\72\5\uffff\1\60\1\157\1\143\1\155\1\157\1\72\1\60\2\uffff\1\162\1\150\1\145\1\154\1\uffff\1\60\1\155\1\156\1\72\1\145\1\164\1\uffff\1\156\1\72\1\164\1\uffff\1\72\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\154\1\162\1\160\1\171\1\162\1\172\1\151\1\156\1\162\1\151\1\157\1\162\1\160\1\156\1\157\1\160\1\170\1\145\1\141\2\171\1\uffff\1\145\3\uffff\1\71\1\55\1\uffff\1\71\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\157\1\170\1\154\1\uffff\1\163\1\141\1\170\1\163\1\144\1\166\1\171\1\156\1\164\1\154\1\151\1\157\1\164\1\157\1\145\3\172\1\162\1\163\1\154\1\144\1\146\1\162\1\151\1\141\1\163\2\156\1\167\1\151\1\150\1\141\1\172\1\171\1\151\1\160\1\151\2\163\1\155\1\160\1\165\1\172\1\uffff\1\71\3\uffff\1\71\4\uffff\1\156\1\141\2\145\1\163\1\145\1\156\1\72\1\62\1\151\2\157\1\72\1\164\1\154\1\160\2\145\1\151\1\154\1\155\1\122\1\165\1\160\1\162\6\72\1\157\1\163\2\165\1\114\1\157\1\153\1\145\1\146\1\163\1\156\1\164\1\147\1\151\1\153\1\145\1\147\1\145\1\154\1\145\1\125\1\156\1\145\2\163\1\151\1\150\3\145\1\72\1\71\1\147\1\164\1\156\1\144\1\145\1\114\1\143\1\uffff\1\137\1\165\1\72\1\154\1\uffff\1\145\2\151\1\157\1\147\1\162\1\156\1\144\2\145\2\160\1\164\6\uffff\1\143\1\151\1\141\1\145\1\151\1\162\1\141\1\156\1\151\1\155\1\141\1\162\2\164\1\72\1\162\1\151\1\162\1\145\1\72\1\122\1\164\1\162\2\72\1\160\3\72\1\172\1\uffff\1\145\1\151\1\141\2\172\1\164\1\151\1\150\1\143\1\163\1\uffff\1\165\1\143\1\156\1\163\1\156\1\157\1\141\1\144\1\72\1\164\1\160\1\72\1\145\2\151\1\157\1\154\1\72\1\156\1\164\1\147\1\164\1\170\1\141\1\162\1\157\1\150\1\72\1\uffff\1\72\1\156\1\145\1\72\1\uffff\1\111\2\72\2\uffff\1\165\4\uffff\1\101\1\156\1\155\1\uffff\1\164\1\156\1\72\1\157\1\72\2\164\1\165\1\151\1\145\1\162\1\172\1\145\1\uffff\1\162\1\157\1\uffff\1\162\1\141\1\164\1\156\1\72\1\uffff\1\153\1\72\1\145\2\72\1\164\1\172\2\72\2\uffff\2\72\1\uffff\1\172\2\uffff\1\154\1\164\1\147\1\145\1\141\1\153\1\uffff\1\156\1\uffff\1\145\1\151\2\157\1\156\1\171\1\uffff\1\162\1\171\1\72\1\172\1\154\1\171\1\72\1\uffff\1\72\1\uffff\1\72\2\uffff\1\151\5\uffff\1\141\1\164\1\172\1\72\1\143\1\72\1\164\1\172\1\157\1\165\1\156\1\164\3\72\1\uffff\1\72\1\uffff\1\72\3\uffff\1\143\1\164\1\141\1\uffff\1\150\1\uffff\1\162\1\156\1\163\2\72\5\uffff\1\172\1\157\1\143\1\155\1\157\1\72\1\172\2\uffff\1\162\1\150\1\145\1\154\1\uffff\1\172\1\155\1\156\1\72\1\145\1\164\1\uffff\1\156\1\72\1\164\1\uffff\1\72\1\uffff";
    static final String DFA21_acceptS =
        "\26\uffff\1\67\1\uffff\1\71\1\72\1\74\2\uffff\1\74\1\uffff\1\100\1\uffff\1\101\3\uffff\1\104\1\105\3\uffff\1\101\54\uffff\1\67\1\uffff\1\70\1\71\1\72\1\uffff\1\100\1\102\1\103\1\104\106\uffff\1\56\4\uffff\1\65\15\uffff\1\57\1\60\1\61\1\62\1\63\1\64\36\uffff\1\66\12\uffff\1\53\34\uffff\1\47\4\uffff\1\54\3\uffff\1\46\1\50\1\uffff\1\51\1\52\1\55\1\73\3\uffff\1\76\15\uffff\1\36\2\uffff\1\37\5\uffff\1\45\11\uffff\1\41\1\42\2\uffff\1\43\1\uffff\1\40\1\44\6\uffff\1\23\1\uffff\1\32\6\uffff\1\77\7\uffff\1\34\1\uffff\1\25\1\uffff\1\30\1\31\1\uffff\1\24\1\26\1\27\1\33\1\35\17\uffff\1\17\1\uffff\1\20\1\uffff\1\22\1\16\1\21\3\uffff\1\12\1\uffff\1\7\5\uffff\1\10\1\11\1\13\1\14\1\15\7\uffff\1\5\1\6\4\uffff\1\4\6\uffff\1\3\3\uffff\1\2\1\uffff\1\1";
    static final String DFA21_specialS =
        "\1\0\41\uffff\1\1\1\2\u0182\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\1\37\3\46\1\43\4\46\1\26\1\27\1\33\1\44\1\32\11\36\7\46\1\16\3\41\1\34\25\41\1\30\1\46\1\31\1\40\1\41\1\46\1\21\1\2\1\4\1\12\1\10\1\1\1\5\1\41\1\6\1\17\1\41\1\13\1\22\1\23\1\14\1\11\1\41\1\3\1\15\1\24\1\20\1\7\1\41\1\25\2\41\uff85\46",
            "\1\51\7\uffff\1\50\2\uffff\1\47",
            "\1\53\15\uffff\1\55\2\uffff\1\54",
            "\1\57\3\uffff\1\60\11\uffff\1\56\1\61",
            "\1\63\6\uffff\1\65\6\uffff\1\62\11\uffff\1\64",
            "\1\66\3\uffff\1\67\10\uffff\1\70",
            "\1\71\11\uffff\1\72\1\73\1\74",
            "\1\77\3\uffff\1\75\3\uffff\1\76",
            "\1\35\1\uffff\1\35\70\uffff\1\101\7\uffff\1\100",
            "\1\102\12\uffff\1\104\5\uffff\1\103",
            "\1\105",
            "\1\106\3\uffff\1\107\5\uffff\1\110",
            "\1\111",
            "\1\113\5\uffff\1\114\6\uffff\1\112",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\3\uffff\1\122",
            "\1\123",
            "\1\125\6\uffff\1\124",
            "\1\126",
            "",
            "\1\35\1\uffff\12\130\13\uffff\1\35\37\uffff\1\35",
            "",
            "",
            "",
            "\12\35",
            "\1\35\1\uffff\1\35",
            "",
            "\12\134",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\136",
            "\0\136",
            "\1\137",
            "",
            "",
            "\1\141\15\uffff\1\142",
            "\1\143\13\uffff\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\5\uffff\1\154",
            "\1\155",
            "\1\157\1\160\1\156",
            "\1\162\6\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\170\5\uffff\1\167",
            "\1\171",
            "\1\172\1\173\1\174",
            "\1\175\1\176",
            "\1\177",
            "\1\u0080\5\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\16\uffff\1\u0087",
            "\1\u0088\3\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\4\uffff\1\u0098",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\12\u009f",
            "",
            "",
            "",
            "\12\134",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\5\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\u009f",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4\12\uffff\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "",
            "\1\u0142",
            "",
            "",
            "",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0160",
            "\1\u0161",
            "",
            "",
            "\1\u0162",
            "\1\u0163",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\1\u016b",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0176\61\uffff\1\u0175",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "",
            "\1\u017a",
            "",
            "",
            "\1\u017b",
            "",
            "",
            "",
            "",
            "",
            "\1\u017c",
            "\1\u017d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "",
            "\1\u018a",
            "",
            "",
            "",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "",
            "\1\u018e",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "\1\u01a5",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FlangeAttachment | BaseAttachment | Ros2_control | Connection | Collision | Component | BaseLink | Category | Cylinder | Filename | Geometry | Inertial | Velocity | EndLink | GitRepo | Inertia | Package | Version | Branch | Distro | Effort | Length | Origin | Parent | Prefix | Radius | Sphere | Visual | AnyURI | Child | Group | Joint | Limit | Lower | Scale | Upper | Value | Axis | Link | Mass | Mesh | Name | Repo | Size | Type | Box | Ixx | Ixy | Ixz | Iyy | Iyz | Izz | Rpy | Xyz | Comma | HyphenMinus | LeftSquareBracket | RightSquareBracket | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_CATEGORY | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='f') ) {s = 1;}

                        else if ( (LA21_0=='b') ) {s = 2;}

                        else if ( (LA21_0=='r') ) {s = 3;}

                        else if ( (LA21_0=='c') ) {s = 4;}

                        else if ( (LA21_0=='g') ) {s = 5;}

                        else if ( (LA21_0=='i') ) {s = 6;}

                        else if ( (LA21_0=='v') ) {s = 7;}

                        else if ( (LA21_0=='e') ) {s = 8;}

                        else if ( (LA21_0=='p') ) {s = 9;}

                        else if ( (LA21_0=='d') ) {s = 10;}

                        else if ( (LA21_0=='l') ) {s = 11;}

                        else if ( (LA21_0=='o') ) {s = 12;}

                        else if ( (LA21_0=='s') ) {s = 13;}

                        else if ( (LA21_0=='A') ) {s = 14;}

                        else if ( (LA21_0=='j') ) {s = 15;}

                        else if ( (LA21_0=='u') ) {s = 16;}

                        else if ( (LA21_0=='a') ) {s = 17;}

                        else if ( (LA21_0=='m') ) {s = 18;}

                        else if ( (LA21_0=='n') ) {s = 19;}

                        else if ( (LA21_0=='t') ) {s = 20;}

                        else if ( (LA21_0=='x') ) {s = 21;}

                        else if ( (LA21_0==',') ) {s = 22;}

                        else if ( (LA21_0=='-') ) {s = 23;}

                        else if ( (LA21_0=='[') ) {s = 24;}

                        else if ( (LA21_0==']') ) {s = 25;}

                        else if ( (LA21_0=='0') ) {s = 26;}

                        else if ( (LA21_0=='.') ) {s = 27;}

                        else if ( (LA21_0=='E') ) {s = 28;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 30;}

                        else if ( (LA21_0=='#') ) {s = 31;}

                        else if ( (LA21_0=='^') ) {s = 32;}

                        else if ( ((LA21_0>='B' && LA21_0<='D')||(LA21_0>='F' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='h'||LA21_0=='k'||LA21_0=='q'||LA21_0=='w'||(LA21_0>='y' && LA21_0<='z')) ) {s = 33;}

                        else if ( (LA21_0=='\"') ) {s = 34;}

                        else if ( (LA21_0=='\'') ) {s = 35;}

                        else if ( (LA21_0=='/') ) {s = 36;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 37;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='$' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='+')||(LA21_0>=':' && LA21_0<='@')||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {s = 38;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_34 = input.LA(1);

                        s = -1;
                        if ( ((LA21_34>='\u0000' && LA21_34<='\uFFFF')) ) {s = 94;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_35 = input.LA(1);

                        s = -1;
                        if ( ((LA21_35>='\u0000' && LA21_35<='\uFFFF')) ) {s = 94;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}