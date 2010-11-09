/**
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.runtime.pipeline.impl;

import org.drools.grid.GridNode;
import org.drools.runtime.CommandExecutor;
import org.drools.runtime.pipeline.ResultHandler;
import org.drools.runtime.pipeline.impl.BasePipelineContext;

public class ExecutionNodePipelineContextImpl extends BasePipelineContext {

    private GridNode node;
    private CommandExecutor commandExecutor;

    public ExecutionNodePipelineContextImpl(GridNode node,
                                            ClassLoader classLoader) {
        this( node, classLoader, null );
    }

    public ExecutionNodePipelineContextImpl(GridNode node,
                                            ClassLoader classLoader,
                                            ResultHandler resultHandler) {
        super( classLoader, resultHandler );
        this.node = node;
    }

    public GridNode getGridNode() {
        return this.node;
    }

    public CommandExecutor getCommandExecutor() {
        return this.commandExecutor;
    }

    public void setCommandExecutor(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

}
