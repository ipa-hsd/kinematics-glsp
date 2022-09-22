/**
 */
package kinematics.impl;

import java.util.Collection;

import kinematics.Joint;
import kinematics.KinematicsPackage;
import kinematics.Link;
import kinematics.Robot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematics.impl.RobotImpl#getId <em>Id</em>}</li>
 *   <li>{@link kinematics.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link kinematics.impl.RobotImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link kinematics.impl.RobotImpl#getJoints <em>Joints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
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
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
   protected EList<Link> links;

   /**
	 * The cached value of the '{@link #getJoints() <em>Joints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #getJoints()
	 * @generated
	 * @ordered
	 */
   protected EList<Joint> joints;

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   protected RobotImpl() {
		super();
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   @Override
   protected EClass eStaticClass() {
		return KinematicsPackage.Literals.ROBOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.ROBOT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.ROBOT__NAME, oldName, name));
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, KinematicsPackage.ROBOT__LINKS);
		}
		return links;
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   public EList<Joint> getJoints() {
		if (joints == null) {
			joints = new EObjectContainmentEList<Joint>(Joint.class, this, KinematicsPackage.ROBOT__JOINTS);
		}
		return joints;
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinematicsPackage.ROBOT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case KinematicsPackage.ROBOT__JOINTS:
				return ((InternalEList<?>)getJoints()).basicRemove(otherEnd, msgs);
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
			case KinematicsPackage.ROBOT__ID:
				return getId();
			case KinematicsPackage.ROBOT__NAME:
				return getName();
			case KinematicsPackage.ROBOT__LINKS:
				return getLinks();
			case KinematicsPackage.ROBOT__JOINTS:
				return getJoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

   /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KinematicsPackage.ROBOT__ID:
				setId((String)newValue);
				return;
			case KinematicsPackage.ROBOT__NAME:
				setName((String)newValue);
				return;
			case KinematicsPackage.ROBOT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case KinematicsPackage.ROBOT__JOINTS:
				getJoints().clear();
				getJoints().addAll((Collection<? extends Joint>)newValue);
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
			case KinematicsPackage.ROBOT__ID:
				setId(ID_EDEFAULT);
				return;
			case KinematicsPackage.ROBOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KinematicsPackage.ROBOT__LINKS:
				getLinks().clear();
				return;
			case KinematicsPackage.ROBOT__JOINTS:
				getJoints().clear();
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
			case KinematicsPackage.ROBOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case KinematicsPackage.ROBOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KinematicsPackage.ROBOT__LINKS:
				return links != null && !links.isEmpty();
			case KinematicsPackage.ROBOT__JOINTS:
				return joints != null && !joints.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RobotImpl
