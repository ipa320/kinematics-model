package de.fraunhofer.ipa.kinematics.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsLexer extends Lexer {
    public static final int Origin=17;
    public static final int DigitTwo=49;
    public static final int Lower=26;
    public static final int RULE_BEGIN=56;
    public static final int Size=44;
    public static final int Effort=14;
    public static final int Ixx=37;
    public static final int RULE_BOOLEAN=52;
    public static final int Ixz=39;
    public static final int Ixy=38;
    public static final int Name=33;
    public static final int Sphere=20;
    public static final int Child=23;
    public static final int Parameters=4;
    public static final int RULE_ID=59;
    public static final int Iyy=40;
    public static final int Filename=8;
    public static final int Mesh=32;
    public static final int RULE_DIGIT=51;
    public static final int Box=36;
    public static final int Iyz=41;
    public static final int Joint=24;
    public static final int Macros=16;
    public static final int Mass=31;
    public static final int AnyURI=22;
    public static final int DigitZero=47;
    public static final int RULE_INT=60;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=62;
    public static final int Inertia=12;
    public static final int Link=30;
    public static final int Xacrorobot=5;
    public static final int Radius=19;
    public static final int RULE_END=57;
    public static final int Parent=18;
    public static final int Izz=42;
    public static final int RULE_STRING=61;
    public static final int RULE_SL_COMMENT=58;
    public static final int HyphenMinus=46;
    public static final int RULE_DOUBLE=54;
    public static final int Rpy=43;
    public static final int RULE_JOINTTYPE=55;
    public static final int Colon=50;
    public static final int RULE_DECINT=53;
    public static final int EOF=-1;
    public static final int Visual=21;
    public static final int Axis=29;
    public static final int Upper=28;
    public static final int RULE_WS=63;
    public static final int Collision=6;
    public static final int DigitOne=48;
    public static final int Scale=27;
    public static final int Inertial=10;
    public static final int RULE_ANY_OTHER=64;
    public static final int Velocity=11;
    public static final int Default=13;
    public static final int Geometry=9;
    public static final int Cylinder=7;
    public static final int Type=34;
    public static final int Length=15;
    public static final int Xyz=45;
    public static final int Limit=25;

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

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:14:12: ( 'parameters:' )
            // InternalKinematicsLexer.g:14:14: 'parameters:'
            {
            match("parameters:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Xacrorobot"
    public final void mXacrorobot() throws RecognitionException {
        try {
            int _type = Xacrorobot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:16:12: ( 'xacrorobot:' )
            // InternalKinematicsLexer.g:16:14: 'xacrorobot:'
            {
            match("xacrorobot:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xacrorobot"

    // $ANTLR start "Collision"
    public final void mCollision() throws RecognitionException {
        try {
            int _type = Collision;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:18:11: ( 'collision:' )
            // InternalKinematicsLexer.g:18:13: 'collision:'
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

    // $ANTLR start "Cylinder"
    public final void mCylinder() throws RecognitionException {
        try {
            int _type = Cylinder;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:20:10: ( 'cylinder:' )
            // InternalKinematicsLexer.g:20:12: 'cylinder:'
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
            // InternalKinematicsLexer.g:22:10: ( 'filename:' )
            // InternalKinematicsLexer.g:22:12: 'filename:'
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
            // InternalKinematicsLexer.g:24:10: ( 'geometry:' )
            // InternalKinematicsLexer.g:24:12: 'geometry:'
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
            // InternalKinematicsLexer.g:26:10: ( 'inertial:' )
            // InternalKinematicsLexer.g:26:12: 'inertial:'
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
            // InternalKinematicsLexer.g:28:10: ( 'velocity:' )
            // InternalKinematicsLexer.g:28:12: 'velocity:'
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

    // $ANTLR start "Inertia"
    public final void mInertia() throws RecognitionException {
        try {
            int _type = Inertia;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:30:9: ( 'inertia:' )
            // InternalKinematicsLexer.g:30:11: 'inertia:'
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

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:32:9: ( 'default' )
            // InternalKinematicsLexer.g:32:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Effort"
    public final void mEffort() throws RecognitionException {
        try {
            int _type = Effort;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:34:8: ( 'effort:' )
            // InternalKinematicsLexer.g:34:10: 'effort:'
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
            // InternalKinematicsLexer.g:36:8: ( 'length:' )
            // InternalKinematicsLexer.g:36:10: 'length:'
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

    // $ANTLR start "Macros"
    public final void mMacros() throws RecognitionException {
        try {
            int _type = Macros;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:38:8: ( 'macros:' )
            // InternalKinematicsLexer.g:38:10: 'macros:'
            {
            match("macros:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Macros"

    // $ANTLR start "Origin"
    public final void mOrigin() throws RecognitionException {
        try {
            int _type = Origin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:40:8: ( 'origin:' )
            // InternalKinematicsLexer.g:40:10: 'origin:'
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
            // InternalKinematicsLexer.g:42:8: ( 'parent:' )
            // InternalKinematicsLexer.g:42:10: 'parent:'
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

    // $ANTLR start "Radius"
    public final void mRadius() throws RecognitionException {
        try {
            int _type = Radius;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:44:8: ( 'radius:' )
            // InternalKinematicsLexer.g:44:10: 'radius:'
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
            // InternalKinematicsLexer.g:46:8: ( 'sphere:' )
            // InternalKinematicsLexer.g:46:10: 'sphere:'
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
            // InternalKinematicsLexer.g:48:8: ( 'visual:' )
            // InternalKinematicsLexer.g:48:10: 'visual:'
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
            // InternalKinematicsLexer.g:50:8: ( 'AnyURI' )
            // InternalKinematicsLexer.g:50:10: 'AnyURI'
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
            // InternalKinematicsLexer.g:52:7: ( 'child:' )
            // InternalKinematicsLexer.g:52:9: 'child:'
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

    // $ANTLR start "Joint"
    public final void mJoint() throws RecognitionException {
        try {
            int _type = Joint;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:54:7: ( 'joint:' )
            // InternalKinematicsLexer.g:54:9: 'joint:'
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
            // InternalKinematicsLexer.g:56:7: ( 'limit:' )
            // InternalKinematicsLexer.g:56:9: 'limit:'
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
            // InternalKinematicsLexer.g:58:7: ( 'lower:' )
            // InternalKinematicsLexer.g:58:9: 'lower:'
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
            // InternalKinematicsLexer.g:60:7: ( 'scale:' )
            // InternalKinematicsLexer.g:60:9: 'scale:'
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
            // InternalKinematicsLexer.g:62:7: ( 'upper:' )
            // InternalKinematicsLexer.g:62:9: 'upper:'
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

    // $ANTLR start "Axis"
    public final void mAxis() throws RecognitionException {
        try {
            int _type = Axis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:64:6: ( 'axis:' )
            // InternalKinematicsLexer.g:64:8: 'axis:'
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
            // InternalKinematicsLexer.g:66:6: ( 'link:' )
            // InternalKinematicsLexer.g:66:8: 'link:'
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
            // InternalKinematicsLexer.g:68:6: ( 'mass:' )
            // InternalKinematicsLexer.g:68:8: 'mass:'
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
            // InternalKinematicsLexer.g:70:6: ( 'mesh:' )
            // InternalKinematicsLexer.g:70:8: 'mesh:'
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
            // InternalKinematicsLexer.g:72:6: ( 'name:' )
            // InternalKinematicsLexer.g:72:8: 'name:'
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

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:74:6: ( 'type:' )
            // InternalKinematicsLexer.g:74:8: 'type:'
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

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:76:7: ( 'value' )
            // InternalKinematicsLexer.g:76:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Box"
    public final void mBox() throws RecognitionException {
        try {
            int _type = Box;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:78:5: ( 'box:' )
            // InternalKinematicsLexer.g:78:7: 'box:'
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
            // InternalKinematicsLexer.g:80:5: ( 'ixx:' )
            // InternalKinematicsLexer.g:80:7: 'ixx:'
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
            // InternalKinematicsLexer.g:82:5: ( 'ixy:' )
            // InternalKinematicsLexer.g:82:7: 'ixy:'
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
            // InternalKinematicsLexer.g:84:5: ( 'ixz:' )
            // InternalKinematicsLexer.g:84:7: 'ixz:'
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
            // InternalKinematicsLexer.g:86:5: ( 'iyy:' )
            // InternalKinematicsLexer.g:86:7: 'iyy:'
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
            // InternalKinematicsLexer.g:88:5: ( 'iyz:' )
            // InternalKinematicsLexer.g:88:7: 'iyz:'
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
            // InternalKinematicsLexer.g:90:5: ( 'izz:' )
            // InternalKinematicsLexer.g:90:7: 'izz:'
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
            // InternalKinematicsLexer.g:92:5: ( 'rpy:' )
            // InternalKinematicsLexer.g:92:7: 'rpy:'
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

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:94:6: ( 'size' )
            // InternalKinematicsLexer.g:94:8: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "Xyz"
    public final void mXyz() throws RecognitionException {
        try {
            int _type = Xyz;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:96:5: ( 'xyz:' )
            // InternalKinematicsLexer.g:96:7: 'xyz:'
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

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:98:13: ( '-' )
            // InternalKinematicsLexer.g:98:15: '-'
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

    // $ANTLR start "DigitZero"
    public final void mDigitZero() throws RecognitionException {
        try {
            int _type = DigitZero;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:100:11: ( '0' )
            // InternalKinematicsLexer.g:100:13: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitZero"

    // $ANTLR start "DigitOne"
    public final void mDigitOne() throws RecognitionException {
        try {
            int _type = DigitOne;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:102:10: ( '1' )
            // InternalKinematicsLexer.g:102:12: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitOne"

    // $ANTLR start "DigitTwo"
    public final void mDigitTwo() throws RecognitionException {
        try {
            int _type = DigitTwo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:104:10: ( '2' )
            // InternalKinematicsLexer.g:104:12: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitTwo"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:106:7: ( ':' )
            // InternalKinematicsLexer.g:106:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalKinematicsLexer.g:108:21: ( '0' .. '9' )
            // InternalKinematicsLexer.g:108:23: '0' .. '9'
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
            // InternalKinematicsLexer.g:110:14: ( ( 'true' | 'false' ) )
            // InternalKinematicsLexer.g:110:16: ( 'true' | 'false' )
            {
            // InternalKinematicsLexer.g:110:16: ( 'true' | 'false' )
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
                    // InternalKinematicsLexer.g:110:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:110:24: 'false'
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
            // InternalKinematicsLexer.g:112:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalKinematicsLexer.g:112:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalKinematicsLexer.g:112:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKinematicsLexer.g:112:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalKinematicsLexer.g:112:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:112:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:112:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalKinematicsLexer.g:112:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalKinematicsLexer.g:112:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalKinematicsLexer.g:112:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalKinematicsLexer.g:112:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKinematicsLexer.g:112:73: ( '-' | '+' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='-') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='0') ) {
                            alt5=1;
                        }
                        else if ( (LA5_1=='-'||(LA5_1>='1' && LA5_1<='9')) ) {
                            alt5=1;
                        }
                    }
                    else if ( (LA5_0=='+') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKinematicsLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DECINT(); 

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
            // InternalKinematicsLexer.g:114:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalKinematicsLexer.g:114:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalKinematicsLexer.g:114:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalKinematicsLexer.g:114:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:114:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalKinematicsLexer.g:114:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:114:29: RULE_DIGIT
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
                    // InternalKinematicsLexer.g:114:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalKinematicsLexer.g:114:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:114:54: RULE_DIGIT
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
            // InternalKinematicsLexer.g:116:16: ( ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' ) )
            // InternalKinematicsLexer.g:116:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            {
            // InternalKinematicsLexer.g:116:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
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
                    // InternalKinematicsLexer.g:116:19: 'revolute'
                    {
                    match("revolute"); 


                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:116:30: 'continuous'
                    {
                    match("continuous"); 


                    }
                    break;
                case 3 :
                    // InternalKinematicsLexer.g:116:43: 'prismatic'
                    {
                    match("prismatic"); 


                    }
                    break;
                case 4 :
                    // InternalKinematicsLexer.g:116:55: 'fixed'
                    {
                    match("fixed"); 


                    }
                    break;
                case 5 :
                    // InternalKinematicsLexer.g:116:63: 'floating'
                    {
                    match("floating"); 


                    }
                    break;
                case 6 :
                    // InternalKinematicsLexer.g:116:74: 'planar'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalKinematicsLexer.g:118:21: ()
            // InternalKinematicsLexer.g:118:23: 
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
            // InternalKinematicsLexer.g:120:19: ()
            // InternalKinematicsLexer.g:120:21: 
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
            // InternalKinematicsLexer.g:122:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalKinematicsLexer.g:122:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalKinematicsLexer.g:122:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKinematicsLexer.g:122:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
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
            // InternalKinematicsLexer.g:124:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKinematicsLexer.g:124:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKinematicsLexer.g:124:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKinematicsLexer.g:124:11: '^'
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

            // InternalKinematicsLexer.g:124:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKinematicsLexer.g:126:10: ( ( '0' .. '9' )+ )
            // InternalKinematicsLexer.g:126:12: ( '0' .. '9' )+
            {
            // InternalKinematicsLexer.g:126:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKinematicsLexer.g:126:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalKinematicsLexer.g:128:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKinematicsLexer.g:128:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKinematicsLexer.g:128:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalKinematicsLexer.g:128:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKinematicsLexer.g:128:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:128:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematicsLexer.g:128:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKinematicsLexer.g:128:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKinematicsLexer.g:128:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalKinematicsLexer.g:128:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKinematicsLexer.g:128:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // InternalKinematicsLexer.g:130:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKinematicsLexer.g:130:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKinematicsLexer.g:130:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKinematicsLexer.g:130:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // InternalKinematicsLexer.g:132:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKinematicsLexer.g:132:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKinematicsLexer.g:132:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalKinematicsLexer.g:134:16: ( . )
            // InternalKinematicsLexer.g:134:18: .
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
        // InternalKinematicsLexer.g:1:8: ( Parameters | Xacrorobot | Collision | Cylinder | Filename | Geometry | Inertial | Velocity | Inertia | Default | Effort | Length | Macros | Origin | Parent | Radius | Sphere | Visual | AnyURI | Child | Joint | Limit | Lower | Scale | Upper | Axis | Link | Mass | Mesh | Name | Type | Value | Box | Ixx | Ixy | Ixz | Iyy | Iyz | Izz | Rpy | Size | Xyz | HyphenMinus | DigitZero | DigitOne | DigitTwo | Colon | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=58;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalKinematicsLexer.g:1:10: Parameters
                {
                mParameters(); 

                }
                break;
            case 2 :
                // InternalKinematicsLexer.g:1:21: Xacrorobot
                {
                mXacrorobot(); 

                }
                break;
            case 3 :
                // InternalKinematicsLexer.g:1:32: Collision
                {
                mCollision(); 

                }
                break;
            case 4 :
                // InternalKinematicsLexer.g:1:42: Cylinder
                {
                mCylinder(); 

                }
                break;
            case 5 :
                // InternalKinematicsLexer.g:1:51: Filename
                {
                mFilename(); 

                }
                break;
            case 6 :
                // InternalKinematicsLexer.g:1:60: Geometry
                {
                mGeometry(); 

                }
                break;
            case 7 :
                // InternalKinematicsLexer.g:1:69: Inertial
                {
                mInertial(); 

                }
                break;
            case 8 :
                // InternalKinematicsLexer.g:1:78: Velocity
                {
                mVelocity(); 

                }
                break;
            case 9 :
                // InternalKinematicsLexer.g:1:87: Inertia
                {
                mInertia(); 

                }
                break;
            case 10 :
                // InternalKinematicsLexer.g:1:95: Default
                {
                mDefault(); 

                }
                break;
            case 11 :
                // InternalKinematicsLexer.g:1:103: Effort
                {
                mEffort(); 

                }
                break;
            case 12 :
                // InternalKinematicsLexer.g:1:110: Length
                {
                mLength(); 

                }
                break;
            case 13 :
                // InternalKinematicsLexer.g:1:117: Macros
                {
                mMacros(); 

                }
                break;
            case 14 :
                // InternalKinematicsLexer.g:1:124: Origin
                {
                mOrigin(); 

                }
                break;
            case 15 :
                // InternalKinematicsLexer.g:1:131: Parent
                {
                mParent(); 

                }
                break;
            case 16 :
                // InternalKinematicsLexer.g:1:138: Radius
                {
                mRadius(); 

                }
                break;
            case 17 :
                // InternalKinematicsLexer.g:1:145: Sphere
                {
                mSphere(); 

                }
                break;
            case 18 :
                // InternalKinematicsLexer.g:1:152: Visual
                {
                mVisual(); 

                }
                break;
            case 19 :
                // InternalKinematicsLexer.g:1:159: AnyURI
                {
                mAnyURI(); 

                }
                break;
            case 20 :
                // InternalKinematicsLexer.g:1:166: Child
                {
                mChild(); 

                }
                break;
            case 21 :
                // InternalKinematicsLexer.g:1:172: Joint
                {
                mJoint(); 

                }
                break;
            case 22 :
                // InternalKinematicsLexer.g:1:178: Limit
                {
                mLimit(); 

                }
                break;
            case 23 :
                // InternalKinematicsLexer.g:1:184: Lower
                {
                mLower(); 

                }
                break;
            case 24 :
                // InternalKinematicsLexer.g:1:190: Scale
                {
                mScale(); 

                }
                break;
            case 25 :
                // InternalKinematicsLexer.g:1:196: Upper
                {
                mUpper(); 

                }
                break;
            case 26 :
                // InternalKinematicsLexer.g:1:202: Axis
                {
                mAxis(); 

                }
                break;
            case 27 :
                // InternalKinematicsLexer.g:1:207: Link
                {
                mLink(); 

                }
                break;
            case 28 :
                // InternalKinematicsLexer.g:1:212: Mass
                {
                mMass(); 

                }
                break;
            case 29 :
                // InternalKinematicsLexer.g:1:217: Mesh
                {
                mMesh(); 

                }
                break;
            case 30 :
                // InternalKinematicsLexer.g:1:222: Name
                {
                mName(); 

                }
                break;
            case 31 :
                // InternalKinematicsLexer.g:1:227: Type
                {
                mType(); 

                }
                break;
            case 32 :
                // InternalKinematicsLexer.g:1:232: Value
                {
                mValue(); 

                }
                break;
            case 33 :
                // InternalKinematicsLexer.g:1:238: Box
                {
                mBox(); 

                }
                break;
            case 34 :
                // InternalKinematicsLexer.g:1:242: Ixx
                {
                mIxx(); 

                }
                break;
            case 35 :
                // InternalKinematicsLexer.g:1:246: Ixy
                {
                mIxy(); 

                }
                break;
            case 36 :
                // InternalKinematicsLexer.g:1:250: Ixz
                {
                mIxz(); 

                }
                break;
            case 37 :
                // InternalKinematicsLexer.g:1:254: Iyy
                {
                mIyy(); 

                }
                break;
            case 38 :
                // InternalKinematicsLexer.g:1:258: Iyz
                {
                mIyz(); 

                }
                break;
            case 39 :
                // InternalKinematicsLexer.g:1:262: Izz
                {
                mIzz(); 

                }
                break;
            case 40 :
                // InternalKinematicsLexer.g:1:266: Rpy
                {
                mRpy(); 

                }
                break;
            case 41 :
                // InternalKinematicsLexer.g:1:270: Size
                {
                mSize(); 

                }
                break;
            case 42 :
                // InternalKinematicsLexer.g:1:275: Xyz
                {
                mXyz(); 

                }
                break;
            case 43 :
                // InternalKinematicsLexer.g:1:279: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 44 :
                // InternalKinematicsLexer.g:1:291: DigitZero
                {
                mDigitZero(); 

                }
                break;
            case 45 :
                // InternalKinematicsLexer.g:1:301: DigitOne
                {
                mDigitOne(); 

                }
                break;
            case 46 :
                // InternalKinematicsLexer.g:1:310: DigitTwo
                {
                mDigitTwo(); 

                }
                break;
            case 47 :
                // InternalKinematicsLexer.g:1:319: Colon
                {
                mColon(); 

                }
                break;
            case 48 :
                // InternalKinematicsLexer.g:1:325: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 49 :
                // InternalKinematicsLexer.g:1:338: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 50 :
                // InternalKinematicsLexer.g:1:350: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 51 :
                // InternalKinematicsLexer.g:1:362: RULE_JOINTTYPE
                {
                mRULE_JOINTTYPE(); 

                }
                break;
            case 52 :
                // InternalKinematicsLexer.g:1:377: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // InternalKinematicsLexer.g:1:393: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalKinematicsLexer.g:1:401: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // InternalKinematicsLexer.g:1:410: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalKinematicsLexer.g:1:422: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalKinematicsLexer.g:1:438: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // InternalKinematicsLexer.g:1:446: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA6_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "112:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\25\47\1\117\1\120\1\124\1\125\1\uffff\1\127\1\uffff\1\43\1\uffff\3\43\2\uffff\3\47\1\uffff\46\47\1\127\4\uffff\1\127\10\uffff\60\47\1\127\5\47\1\uffff\12\47\6\uffff\16\47\1\uffff\3\47\1\u00de\6\47\1\u00e5\1\uffff\12\47\1\u00f0\1\u00e5\5\47\1\u00f6\4\47\1\uffff\2\47\2\uffff\5\47\1\uffff\3\47\4\uffff\3\47\1\u00f0\4\47\1\uffff\1\47\1\uffff\5\47\1\uffff\3\47\2\uffff\5\47\1\uffff\1\u011a\2\uffff\1\47\1\uffff\12\47\1\uffff\1\u0127\5\uffff\1\47\2\uffff\7\47\1\u00f0\2\47\1\uffff\1\47\1\uffff\1\u00f0\1\47\1\u00f0\3\47\5\uffff\2\47\1\uffff\1\u00f0\2\uffff";
    static final String DFA20_eofS =
        "\u0139\uffff";
    static final String DFA20_minS =
        "\1\0\2\141\1\150\1\141\1\145\1\156\1\141\1\145\1\146\1\145\1\141\1\162\1\141\1\143\1\156\1\157\1\160\1\170\1\141\1\162\1\157\1\60\3\56\1\uffff\1\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\162\1\151\1\141\1\uffff\1\143\1\172\2\154\1\151\2\154\2\157\1\145\1\170\1\171\1\172\1\154\1\163\1\154\2\146\1\156\1\155\1\167\1\143\1\163\1\151\1\144\1\171\1\166\1\150\1\141\1\172\1\171\1\151\1\160\1\151\1\155\1\160\1\165\1\170\1\56\4\uffff\1\56\10\uffff\1\141\1\163\1\156\1\162\1\72\1\154\1\164\1\151\1\154\2\145\1\163\1\141\1\155\1\162\6\72\1\157\2\165\1\141\1\157\1\147\1\151\1\153\1\145\1\162\1\163\1\150\1\147\1\151\1\72\1\157\1\145\1\154\1\145\1\125\1\156\1\145\1\163\3\145\1\72\1\56\1\155\1\156\1\155\1\141\1\157\1\uffff\2\151\1\156\1\144\1\156\1\144\1\145\1\164\1\145\1\164\6\uffff\1\143\1\141\1\145\1\165\1\162\2\164\1\72\1\162\1\157\2\72\1\151\1\165\1\uffff\1\154\1\162\1\145\1\60\1\122\1\164\1\162\3\72\1\60\1\uffff\1\145\1\164\1\141\2\162\1\163\1\156\1\144\1\72\1\141\2\60\1\151\1\164\2\151\1\154\1\60\1\154\1\164\1\150\1\72\1\uffff\1\72\1\163\2\uffff\1\156\1\163\1\165\1\145\1\72\1\uffff\1\111\2\72\4\uffff\1\164\1\72\1\164\1\60\1\157\1\151\1\165\1\145\1\uffff\1\155\1\uffff\1\156\1\162\1\141\1\164\1\72\1\uffff\1\164\2\72\2\uffff\3\72\1\164\1\72\1\uffff\1\60\2\uffff\1\145\1\uffff\1\151\1\142\2\157\1\162\1\145\1\147\1\171\1\72\1\171\1\uffff\1\60\5\uffff\1\145\2\uffff\1\162\1\143\1\157\1\156\1\165\2\72\1\60\2\72\1\uffff\1\72\1\uffff\1\60\1\163\1\60\1\164\1\72\1\163\5\uffff\2\72\1\uffff\1\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\162\2\171\1\154\1\145\1\172\1\151\1\145\1\146\1\157\1\145\1\162\2\160\1\156\1\157\1\160\1\170\1\141\1\171\1\157\1\71\3\145\1\uffff\1\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\162\1\151\1\141\1\uffff\1\143\1\172\1\156\1\154\1\151\1\170\1\154\2\157\1\145\3\172\1\154\1\163\1\154\2\146\2\156\1\167\2\163\1\151\1\144\1\171\1\166\1\150\1\141\1\172\1\171\1\151\1\160\1\151\1\155\1\160\1\165\1\170\1\145\4\uffff\1\145\10\uffff\1\145\1\163\1\156\1\162\1\72\1\154\1\164\1\151\1\154\2\145\1\163\1\141\1\155\1\162\6\72\1\157\2\165\1\141\1\157\1\147\1\151\1\153\1\145\1\162\1\163\1\150\1\147\1\151\1\72\1\157\1\145\1\154\1\145\1\125\1\156\1\145\1\163\3\145\1\72\1\145\1\155\1\156\1\155\1\141\1\157\1\uffff\2\151\1\156\1\144\1\156\1\144\1\145\1\164\1\145\1\164\6\uffff\1\143\1\141\1\145\1\165\1\162\2\164\1\72\1\162\1\157\2\72\1\151\1\165\1\uffff\1\154\1\162\1\145\1\172\1\122\1\164\1\162\3\72\1\172\1\uffff\1\145\1\164\1\141\2\162\1\163\1\156\1\144\1\72\1\141\2\172\1\151\1\164\2\151\1\154\1\172\1\154\1\164\1\150\1\72\1\uffff\1\72\1\163\2\uffff\1\156\1\163\1\165\1\145\1\72\1\uffff\1\111\2\72\4\uffff\1\164\1\72\1\164\1\172\1\157\1\151\1\165\1\145\1\uffff\1\155\1\uffff\1\156\1\162\1\141\1\164\1\72\1\uffff\1\164\2\72\2\uffff\3\72\1\164\1\72\1\uffff\1\172\2\uffff\1\145\1\uffff\1\151\1\142\2\157\1\162\1\145\1\147\1\171\1\154\1\171\1\uffff\1\172\5\uffff\1\145\2\uffff\1\162\1\143\1\157\1\156\1\165\2\72\1\172\2\72\1\uffff\1\72\1\uffff\1\172\1\163\1\172\1\164\1\72\1\163\5\uffff\2\72\1\uffff\1\172\2\uffff";
    static final String DFA20_acceptS =
        "\32\uffff\1\57\1\uffff\1\64\1\uffff\1\65\3\uffff\1\71\1\72\3\uffff\1\65\47\uffff\1\53\1\54\1\61\1\66\1\uffff\1\55\1\56\1\57\1\62\1\64\1\67\1\70\1\71\66\uffff\1\52\12\uffff\1\42\1\43\1\44\1\45\1\46\1\47\16\uffff\1\50\13\uffff\1\41\26\uffff\1\33\2\uffff\1\34\1\35\5\uffff\1\51\3\uffff\1\32\1\36\1\37\1\60\10\uffff\1\24\1\uffff\1\63\5\uffff\1\40\3\uffff\1\26\1\27\5\uffff\1\30\1\uffff\1\25\1\31\1\uffff\1\17\12\uffff\1\22\1\uffff\1\13\1\14\1\15\1\16\1\20\1\uffff\1\21\1\23\12\uffff\1\11\1\uffff\1\12\6\uffff\1\4\1\5\1\6\1\7\1\10\2\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\2\36\uffff\1\0\1\1\u0118\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\1\34\3\43\1\40\5\43\1\26\1\43\1\41\1\27\1\30\1\31\7\33\1\32\6\43\1\17\31\36\3\43\1\35\1\36\1\43\1\22\1\25\1\3\1\10\1\11\1\4\1\5\1\36\1\6\1\20\1\36\1\12\1\13\1\23\1\14\1\1\1\36\1\15\1\16\1\24\1\21\1\7\1\36\1\2\2\36\uff85\43",
            "\1\44\12\uffff\1\46\5\uffff\1\45",
            "\1\50\27\uffff\1\51",
            "\1\54\6\uffff\1\52\11\uffff\1\53",
            "\1\56\7\uffff\1\55\2\uffff\1\57",
            "\1\60",
            "\1\61\11\uffff\1\62\1\63\1\64",
            "\1\67\3\uffff\1\65\3\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\72\3\uffff\1\73\5\uffff\1\74",
            "\1\75\3\uffff\1\76",
            "\1\77",
            "\1\100\3\uffff\1\102\12\uffff\1\101",
            "\1\104\5\uffff\1\105\6\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114\6\uffff\1\113",
            "\1\115",
            "\12\116",
            "\1\121\1\uffff\12\122\13\uffff\1\121\37\uffff\1\121",
            "\1\121\1\uffff\12\123\13\uffff\1\121\37\uffff\1\121",
            "\1\121\1\uffff\12\123\13\uffff\1\121\37\uffff\1\121",
            "",
            "\1\121\1\uffff\12\123\13\uffff\1\121\37\uffff\1\121",
            "",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\131",
            "\0\131",
            "\1\132",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141\1\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145\13\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\1\154\1\155",
            "\1\156\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167\1\170",
            "\1\171",
            "\1\172\17\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\121\1\uffff\12\u008c\13\uffff\1\121\37\uffff\1\121",
            "",
            "",
            "",
            "",
            "\1\121\1\uffff\12\123\13\uffff\1\121\37\uffff\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d\3\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
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
            "\1\u00ad",
            "\1\u00ae",
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
            "\1\121\1\uffff\12\u008c\13\uffff\1\121\37\uffff\1\121",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "",
            "",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0125\61\uffff\1\u0124",
            "\1\u0126",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "\1\u0128",
            "",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0133",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "",
            "",
            "",
            "",
            "\1\u0137",
            "\1\u0138",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Parameters | Xacrorobot | Collision | Cylinder | Filename | Geometry | Inertial | Velocity | Inertia | Default | Effort | Length | Macros | Origin | Parent | Radius | Sphere | Visual | AnyURI | Child | Joint | Limit | Lower | Scale | Upper | Axis | Link | Mass | Mesh | Name | Type | Value | Box | Ixx | Ixy | Ixz | Iyy | Iyz | Izz | Rpy | Size | Xyz | HyphenMinus | DigitZero | DigitOne | DigitTwo | Colon | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_31 = input.LA(1);

                        s = -1;
                        if ( ((LA20_31>='\u0000' && LA20_31<='\uFFFF')) ) {s = 89;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_32 = input.LA(1);

                        s = -1;
                        if ( ((LA20_32>='\u0000' && LA20_32<='\uFFFF')) ) {s = 89;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='p') ) {s = 1;}

                        else if ( (LA20_0=='x') ) {s = 2;}

                        else if ( (LA20_0=='c') ) {s = 3;}

                        else if ( (LA20_0=='f') ) {s = 4;}

                        else if ( (LA20_0=='g') ) {s = 5;}

                        else if ( (LA20_0=='i') ) {s = 6;}

                        else if ( (LA20_0=='v') ) {s = 7;}

                        else if ( (LA20_0=='d') ) {s = 8;}

                        else if ( (LA20_0=='e') ) {s = 9;}

                        else if ( (LA20_0=='l') ) {s = 10;}

                        else if ( (LA20_0=='m') ) {s = 11;}

                        else if ( (LA20_0=='o') ) {s = 12;}

                        else if ( (LA20_0=='r') ) {s = 13;}

                        else if ( (LA20_0=='s') ) {s = 14;}

                        else if ( (LA20_0=='A') ) {s = 15;}

                        else if ( (LA20_0=='j') ) {s = 16;}

                        else if ( (LA20_0=='u') ) {s = 17;}

                        else if ( (LA20_0=='a') ) {s = 18;}

                        else if ( (LA20_0=='n') ) {s = 19;}

                        else if ( (LA20_0=='t') ) {s = 20;}

                        else if ( (LA20_0=='b') ) {s = 21;}

                        else if ( (LA20_0=='-') ) {s = 22;}

                        else if ( (LA20_0=='0') ) {s = 23;}

                        else if ( (LA20_0=='1') ) {s = 24;}

                        else if ( (LA20_0=='2') ) {s = 25;}

                        else if ( (LA20_0==':') ) {s = 26;}

                        else if ( ((LA20_0>='3' && LA20_0<='9')) ) {s = 27;}

                        else if ( (LA20_0=='#') ) {s = 28;}

                        else if ( (LA20_0=='^') ) {s = 29;}

                        else if ( ((LA20_0>='B' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='h'||LA20_0=='k'||LA20_0=='q'||LA20_0=='w'||(LA20_0>='y' && LA20_0<='z')) ) {s = 30;}

                        else if ( (LA20_0=='\"') ) {s = 31;}

                        else if ( (LA20_0=='\'') ) {s = 32;}

                        else if ( (LA20_0=='/') ) {s = 33;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 34;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='$' && LA20_0<='&')||(LA20_0>='(' && LA20_0<=',')||LA20_0=='.'||(LA20_0>=';' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}