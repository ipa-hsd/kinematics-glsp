/**
 */
package kinematics.impl;

import kinematics.Axis;
import kinematics.Joint;
import kinematics.JointType;
import kinematics.KinematicsPackage;
import kinematics.Limit;
import kinematics.Link;
import kinematics.Pose;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematics.impl.JointImpl#getName <em>Name</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getId <em>Id</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getChild <em>Child</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getType <em>Type</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointImpl extends MinimalEObjectImpl.Container implements Joint {
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final String ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected String id = ID_EDEFAULT;

   /**
    * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getParent()
    * @generated
    * @ordered
    */
   protected Link parent;

   /**
    * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getChild()
    * @generated
    * @ordered
    */
   protected Link child;

   /**
    * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOrigin()
    * @generated
    * @ordered
    */
   protected Pose origin;

   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final JointType TYPE_EDEFAULT = JointType.FIXED;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected JointType type = TYPE_EDEFAULT;

   /**
    * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLimit()
    * @generated
    * @ordered
    */
   protected Limit limit;

   /**
    * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAxis()
    * @generated
    * @ordered
    */
   protected Axis axis;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected JointImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsPackage.Literals.JOINT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName() {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setName(String newName) {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getId() {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setId(String newId) {
      String oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__ID, oldId, id));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link getParent() {
      if (parent != null && parent.eIsProxy()) {
         InternalEObject oldParent = (InternalEObject)parent;
         parent = (Link)eResolveProxy(oldParent);
         if (parent != oldParent) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.JOINT__PARENT, oldParent, parent));
         }
      }
      return parent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link basicGetParent() {
      return parent;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParent(Link newParent) {
      Link oldParent = parent;
      parent = newParent;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__PARENT, oldParent, parent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link getChild() {
      if (child != null && child.eIsProxy()) {
         InternalEObject oldChild = (InternalEObject)child;
         child = (Link)eResolveProxy(oldChild);
         if (child != oldChild) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.JOINT__CHILD, oldChild, child));
         }
      }
      return child;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link basicGetChild() {
      return child;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setChild(Link newChild) {
      Link oldChild = child;
      child = newChild;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__CHILD, oldChild, child));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pose getOrigin() {
      return origin;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOrigin(Pose newOrigin, NotificationChain msgs) {
      Pose oldOrigin = origin;
      origin = newOrigin;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__ORIGIN, oldOrigin, newOrigin);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOrigin(Pose newOrigin) {
      if (newOrigin != origin) {
         NotificationChain msgs = null;
         if (origin != null)
            msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.JOINT__ORIGIN, null, msgs);
         if (newOrigin != null)
            msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.JOINT__ORIGIN, null, msgs);
         msgs = basicSetOrigin(newOrigin, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__ORIGIN, newOrigin, newOrigin));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public JointType getType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setType(JointType newType) {
      JointType oldType = type;
      type = newType == null ? TYPE_EDEFAULT : newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Limit getLimit() {
      return limit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLimit(Limit newLimit, NotificationChain msgs) {
      Limit oldLimit = limit;
      limit = newLimit;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__LIMIT, oldLimit, newLimit);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLimit(Limit newLimit) {
      if (newLimit != limit) {
         NotificationChain msgs = null;
         if (limit != null)
            msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.JOINT__LIMIT, null, msgs);
         if (newLimit != null)
            msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.JOINT__LIMIT, null, msgs);
         msgs = basicSetLimit(newLimit, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__LIMIT, newLimit, newLimit));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Axis getAxis() {
      return axis;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAxis(Axis newAxis, NotificationChain msgs) {
      Axis oldAxis = axis;
      axis = newAxis;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__AXIS, oldAxis, newAxis);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAxis(Axis newAxis) {
      if (newAxis != axis) {
         NotificationChain msgs = null;
         if (axis != null)
            msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.JOINT__AXIS, null, msgs);
         if (newAxis != null)
            msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.JOINT__AXIS, null, msgs);
         msgs = basicSetAxis(newAxis, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__AXIS, newAxis, newAxis));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case KinematicsPackage.JOINT__ORIGIN:
            return basicSetOrigin(null, msgs);
         case KinematicsPackage.JOINT__LIMIT:
            return basicSetLimit(null, msgs);
         case KinematicsPackage.JOINT__AXIS:
            return basicSetAxis(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsPackage.JOINT__NAME:
            return getName();
         case KinematicsPackage.JOINT__ID:
            return getId();
         case KinematicsPackage.JOINT__PARENT:
            if (resolve) return getParent();
            return basicGetParent();
         case KinematicsPackage.JOINT__CHILD:
            if (resolve) return getChild();
            return basicGetChild();
         case KinematicsPackage.JOINT__ORIGIN:
            return getOrigin();
         case KinematicsPackage.JOINT__TYPE:
            return getType();
         case KinematicsPackage.JOINT__LIMIT:
            return getLimit();
         case KinematicsPackage.JOINT__AXIS:
            return getAxis();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case KinematicsPackage.JOINT__NAME:
            setName((String)newValue);
            return;
         case KinematicsPackage.JOINT__ID:
            setId((String)newValue);
            return;
         case KinematicsPackage.JOINT__PARENT:
            setParent((Link)newValue);
            return;
         case KinematicsPackage.JOINT__CHILD:
            setChild((Link)newValue);
            return;
         case KinematicsPackage.JOINT__ORIGIN:
            setOrigin((Pose)newValue);
            return;
         case KinematicsPackage.JOINT__TYPE:
            setType((JointType)newValue);
            return;
         case KinematicsPackage.JOINT__LIMIT:
            setLimit((Limit)newValue);
            return;
         case KinematicsPackage.JOINT__AXIS:
            setAxis((Axis)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case KinematicsPackage.JOINT__NAME:
            setName(NAME_EDEFAULT);
            return;
         case KinematicsPackage.JOINT__ID:
            setId(ID_EDEFAULT);
            return;
         case KinematicsPackage.JOINT__PARENT:
            setParent((Link)null);
            return;
         case KinematicsPackage.JOINT__CHILD:
            setChild((Link)null);
            return;
         case KinematicsPackage.JOINT__ORIGIN:
            setOrigin((Pose)null);
            return;
         case KinematicsPackage.JOINT__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case KinematicsPackage.JOINT__LIMIT:
            setLimit((Limit)null);
            return;
         case KinematicsPackage.JOINT__AXIS:
            setAxis((Axis)null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case KinematicsPackage.JOINT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case KinematicsPackage.JOINT__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case KinematicsPackage.JOINT__PARENT:
            return parent != null;
         case KinematicsPackage.JOINT__CHILD:
            return child != null;
         case KinematicsPackage.JOINT__ORIGIN:
            return origin != null;
         case KinematicsPackage.JOINT__TYPE:
            return type != TYPE_EDEFAULT;
         case KinematicsPackage.JOINT__LIMIT:
            return limit != null;
         case KinematicsPackage.JOINT__AXIS:
            return axis != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuilder result = new StringBuilder(super.toString());
      result.append(" (name: ");
      result.append(name);
      result.append(", id: ");
      result.append(id);
      result.append(", type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} //JointImpl
