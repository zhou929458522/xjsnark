package xjsnark.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class typeof_IntegerConstant_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IntegerConstant_InferenceRule() {
  }
  public boolean overrides(final SNode integerConstant, IsApplicableStatus status) {
    return true;
  }
  public void applyRule(final SNode integerConstant, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer"))) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, 0x10cd01cf3c4L, "componentType")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940cc380dL, "jetbrains.mps.baseLanguage.structure.ShortType"))) {
        if (SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) >= Short.MIN_VALUE && SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) <= Short.MAX_VALUE) {
          {
            SNode _nodeToCheck_1029348928467 = integerConstant;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7012155836965723622", 0, null);
            typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7012155836965722303", true), (SNode) SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940cc380dL, "jetbrains.mps.baseLanguage.structure.ShortType"))), _info_12389875345);
          }
          return;
        }
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, 0x10cd01cf3c4L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")) && SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) >= 0) {
        int declarationBitwidth = SPropertyOperations.getInteger(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, 0x10cd01cf3c4L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")), MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"));
        SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")));
        int actualBitwidth = (int) Math.ceil(Math.log(SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"))) / Math.log(2));
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + ((actualBitwidth > declarationBitwidth ? actualBitwidth : declarationBitwidth)));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "496999964782603724", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "496999964782603728", true), (SNode) node, _info_12389875345);
        }
        return;
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, 0x10cd01cf3c4L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType"))) {
        SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")));
        SLinkOperations.setTarget(node, MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec"), SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cd01b77ddL, 0x10cd01cf3c4L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")), MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec")));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410679038", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410679042", true), (SNode) node, _info_12389875345);
        }
        return;
      }
    } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e96L, "jetbrains.mps.baseLanguage.structure.AssignmentExpression"))) {
      SNode n = SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e96L, "jetbrains.mps.baseLanguage.structure.AssignmentExpression"));
      final SNode expressionType_typevar_1110240119278810315 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11b0d00332cL, 0xf8c77f1e97L, "lValue"));
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "1110240119278810316", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.getRepresentative(expressionType_typevar_1110240119278810315), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "1110240119278810318", true), _info_12389875345);
      }


      {
        final SNode exType = typeCheckingContext.getRepresentative(expressionType_typevar_1110240119278810315);
        typeCheckingContext.whenConcrete(exType, new Runnable() {
          public void run() {
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getExpandedNode(exType), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType"))) {
              int declarationBitwidth = SPropertyOperations.getInteger(SNodeOperations.as(typeCheckingContext.getExpandedNode(exType), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")), MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"));
              SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")));
              int actualBitwidth = (int) Math.ceil(Math.log(SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"))) / Math.log(2));
              SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + ((actualBitwidth > declarationBitwidth ? actualBitwidth : declarationBitwidth)));
              {
                SNode _nodeToCheck_1029348928467 = integerConstant;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410684933", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410684937", true), (SNode) node, _info_12389875345);
              }
              return;
            } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getExpandedNode(exType), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType"))) {
              SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")));
              SLinkOperations.setTarget(node, MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec"), SLinkOperations.getTarget(SNodeOperations.as(typeCheckingContext.getExpandedNode(exType), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")), MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec")));
              {
                SNode _nodeToCheck_1029348928467 = integerConstant;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410684961", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410684965", true), (SNode) node, _info_12389875345);
              }
              return;
            } else {
              {
                SNode _nodeToCheck_1029348928467 = integerConstant;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "2280652580000841740", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "2280652580000841746", true), (SNode) SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"))), _info_12389875345);
              }
            }

          }
        }, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "1110240119278812190", false, false);
      }

    } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"))) {
      SNode n = SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")) && SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer")) == integerConstant && SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) >= 0) {
        int declarationBitwidth = SPropertyOperations.getInteger(SNodeOperations.as(SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")), MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"));
        SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")));
        int actualBitwidth = (int) Math.ceil(Math.log(SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"))) / Math.log(2));
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + ((actualBitwidth > declarationBitwidth ? actualBitwidth : declarationBitwidth)));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410703180", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410703184", true), (SNode) node, _info_12389875345);
        }
        return;
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")) && SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer")) == integerConstant) {
        SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")));
        SLinkOperations.setTarget(node, MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec"), SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(n, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")), MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec")));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410703222", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410703226", true), (SNode) node, _info_12389875345);
        }
        return;
      }

    } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a770dc0dL, "jetbrains.mps.baseLanguage.structure.ArrayLiteral"))) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a770dc0dL, "jetbrains.mps.baseLanguage.structure.ArrayLiteral"))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType"))) {
        int declarationBitwidth = SPropertyOperations.getInteger(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a770dc0dL, "jetbrains.mps.baseLanguage.structure.ArrayLiteral"))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")), MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"));
        SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")));
        int actualBitwidth = (int) Math.ceil(Math.log(SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"))) / Math.log(2));
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + ((actualBitwidth > declarationBitwidth ? actualBitwidth : declarationBitwidth)));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410737146", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410737150", true), (SNode) node, _info_12389875345);
        }
        return;
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a770dc0dL, "jetbrains.mps.baseLanguage.structure.ArrayLiteral"))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType"))) {
        SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")));
        SLinkOperations.setTarget(node, MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec"), SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(SNodeOperations.as(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x114a770dc0dL, "jetbrains.mps.baseLanguage.structure.ArrayLiteral"))), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, "jetbrains.mps.baseLanguage.structure.ArrayType")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d819f7L, 0xf940d819f8L, "componentType")), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, "xjsnark.structure.JFieldType")), MetaAdapterFactory.getReferenceLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1ca7332L, 0x68d52c08c1ca734cL, "fieldRec")));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410737196", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "6238098797410737200", true), (SNode) node, _info_12389875345);
        }
        return;

      }
    } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(integerConstant), MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x73bec06cafa7537cL, "xjsnark.structure.VerifyEqStatement")) && SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) >= 0) {
      SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")));
      if (SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value")) == 0) {
        int actualBitwidth = 1;
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + (actualBitwidth));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "8112485802413863246", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "8112485802413863250", true), (SNode) node, _info_12389875345);
        }

      } else {
        int actualBitwidth = (int) Math.ceil(Math.log(SPropertyOperations.getInteger(integerConstant, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"))) / Math.log(2));
        SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + (actualBitwidth));
        {
          SNode _nodeToCheck_1029348928467 = integerConstant;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "8112485802412583472", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "8112485802412583476", true), (SNode) node, _info_12389875345);
        }
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = integerConstant;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7012155836965724905", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7012155836965724911", true), (SNode) SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"))), _info_12389875345);
      }
    }


  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
}