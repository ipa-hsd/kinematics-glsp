/**
 */
package kinematics.impl;

import kinematics.Joint;
import kinematics.KinematicsPackage;
import kinematics.Link;

import org.eclipse.emf.common.notify.Notification;

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
      result.append(')');
      return result.toString();
   }

} //JointImpl
