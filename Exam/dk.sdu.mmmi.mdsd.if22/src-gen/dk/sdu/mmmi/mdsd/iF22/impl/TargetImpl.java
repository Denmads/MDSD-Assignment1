/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.iF22.impl;

import dk.sdu.mmmi.mdsd.iF22.EndingTarget;
import dk.sdu.mmmi.mdsd.iF22.Exp;
import dk.sdu.mmmi.mdsd.iF22.IF22Package;
import dk.sdu.mmmi.mdsd.iF22.Target;
import dk.sdu.mmmi.mdsd.iF22.TargetDestination;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.impl.TargetImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.impl.TargetImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.impl.TargetImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.iF22.impl.TargetImpl#getEndTargets <em>End Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target
{
  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected TargetDestination destination;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Exp> arguments;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Exp condition;

  /**
   * The cached value of the '{@link #getEndTargets() <em>End Targets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndTargets()
   * @generated
   * @ordered
   */
  protected EList<EndingTarget> endTargets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IF22Package.Literals.TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TargetDestination getDestination()
  {
    if (destination != null && destination.eIsProxy())
    {
      InternalEObject oldDestination = (InternalEObject)destination;
      destination = (TargetDestination)eResolveProxy(oldDestination);
      if (destination != oldDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IF22Package.TARGET__DESTINATION, oldDestination, destination));
      }
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetDestination basicGetDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDestination(TargetDestination newDestination)
  {
    TargetDestination oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IF22Package.TARGET__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Exp> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Exp>(Exp.class, this, IF22Package.TARGET__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Exp newCondition, NotificationChain msgs)
  {
    Exp oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IF22Package.TARGET__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Exp newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IF22Package.TARGET__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IF22Package.TARGET__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IF22Package.TARGET__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EndingTarget> getEndTargets()
  {
    if (endTargets == null)
    {
      endTargets = new EObjectContainmentEList<EndingTarget>(EndingTarget.class, this, IF22Package.TARGET__END_TARGETS);
    }
    return endTargets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IF22Package.TARGET__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case IF22Package.TARGET__CONDITION:
        return basicSetCondition(null, msgs);
      case IF22Package.TARGET__END_TARGETS:
        return ((InternalEList<?>)getEndTargets()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IF22Package.TARGET__DESTINATION:
        if (resolve) return getDestination();
        return basicGetDestination();
      case IF22Package.TARGET__ARGUMENTS:
        return getArguments();
      case IF22Package.TARGET__CONDITION:
        return getCondition();
      case IF22Package.TARGET__END_TARGETS:
        return getEndTargets();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IF22Package.TARGET__DESTINATION:
        setDestination((TargetDestination)newValue);
        return;
      case IF22Package.TARGET__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Exp>)newValue);
        return;
      case IF22Package.TARGET__CONDITION:
        setCondition((Exp)newValue);
        return;
      case IF22Package.TARGET__END_TARGETS:
        getEndTargets().clear();
        getEndTargets().addAll((Collection<? extends EndingTarget>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IF22Package.TARGET__DESTINATION:
        setDestination((TargetDestination)null);
        return;
      case IF22Package.TARGET__ARGUMENTS:
        getArguments().clear();
        return;
      case IF22Package.TARGET__CONDITION:
        setCondition((Exp)null);
        return;
      case IF22Package.TARGET__END_TARGETS:
        getEndTargets().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IF22Package.TARGET__DESTINATION:
        return destination != null;
      case IF22Package.TARGET__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case IF22Package.TARGET__CONDITION:
        return condition != null;
      case IF22Package.TARGET__END_TARGETS:
        return endTargets != null && !endTargets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TargetImpl
