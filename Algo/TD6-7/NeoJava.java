...
firstNode = tx.createNode();
firstNode.setProperty( "message", "Node1 " );
secondNode = tx.createNode();
secondNode.setProperty( "message", "Node2" );

relationship = firstNode.createRelationshipTo
( secondNode, RelTypes.KNOWS );
            
relationship.setProperty( "message", "relation12 " );
...
